/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans.impl.schema;

import org.apache.xmlbeans.*;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.xb.xsdschema.*;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StscComplexTypeResolver {


    @SuppressWarnings("unused")
    static void resolveErrorType(SchemaTypeImpl sImpl) {
        throw new RuntimeException("This type of error recovery not yet implemented.");
    }

    private static SchemaType.Ref[] makeRefArray(Collection<SchemaType> typeList) {
        return typeList.stream().map(SchemaType::getRef).toArray(SchemaType.Ref[]::new);
    }

    static class WildcardResult {
        WildcardResult(QNameSet typedWildcards, boolean hasWildcards) {
            this.typedWildcards = typedWildcards;
            this.hasWildcards = hasWildcards;
        }

        QNameSet typedWildcards;
        boolean hasWildcards;
    }

    static WildcardResult summarizeAttrWildcards(SchemaAttributeModel attrModel) {
        if (attrModel.getWildcardProcess() == SchemaAttributeModel.NONE) {
            return new WildcardResult(QNameSet.EMPTY, false);
        }
        if (attrModel.getWildcardProcess() == SchemaAttributeModel.SKIP) {
            return new WildcardResult(QNameSet.EMPTY, true);
        }
        return new WildcardResult(attrModel.getWildcardSet(), true);
    }

    static WildcardResult summarizeEltWildcards(SchemaParticle contentModel) {
        if (contentModel == null) {
            return new WildcardResult(QNameSet.EMPTY, false);
        }

        switch (contentModel.getParticleType()) {
            case SchemaParticle.ALL:
            case SchemaParticle.SEQUENCE:
            case SchemaParticle.CHOICE:
                QNameSetBuilder set = new QNameSetBuilder();
                boolean hasWildcards = false;
                for (int i = 0; i < contentModel.countOfParticleChild(); i++) {
                    WildcardResult inner = summarizeEltWildcards(contentModel.getParticleChild(i));
                    set.addAll(inner.typedWildcards);
                    hasWildcards |= inner.hasWildcards;
                }
                return new WildcardResult(set.toQNameSet(), hasWildcards);
            case SchemaParticle.WILDCARD:
                return new WildcardResult(
                    (contentModel.getWildcardProcess() == SchemaParticle.SKIP) ?
                        QNameSet.EMPTY : contentModel.getWildcardSet(), true);
            // otherwise fallthrough

            default:
                return new WildcardResult(QNameSet.EMPTY, false);
        }
    }


    static BigInteger extractMinOccurs(XmlNonNegativeInteger nni) {
        if (nni == null) {
            return BigInteger.ONE;
        }
        BigInteger result = nni.getBigIntegerValue();
        if (result == null) {
            return BigInteger.ONE;
        }
        return result;
    }

    static void addMinusPointlessParticles(
        List<SchemaParticle> list, SchemaParticle part, int parentParticleType) {
        if (part == null) {
            return;
        }

        switch (part.getParticleType()) {
            case SchemaParticle.SEQUENCE:
                if (parentParticleType == SchemaParticle.SEQUENCE && part.isSingleton()) {
                    // emitDBG("dropping redundant sequence");
                    list.addAll(Arrays.asList(part.getParticleChildren()));
                    return;
                }
                break;

            case SchemaParticle.CHOICE:
                if (parentParticleType == SchemaParticle.CHOICE && part.isSingleton()) {
                    // emitDBG("dropping redundant choice");
                    list.addAll(Arrays.asList(part.getParticleChildren()));
                    return;
                }
                break;

            case SchemaParticle.ALL:
            default:
        }
        list.add(part);
    }

    private static <T> BinaryOperator<T> throwingMerger() {
        return (u,v) -> { throw new IllegalStateException("Duplicate key "+u.toString()); };
    }

    static Map<QName, SchemaProperty> buildAttributePropertyModelByQName(SchemaAttributeModel attrModel, SchemaType owner) {
        return Stream.of(attrModel.getAttributes())
            .collect(Collectors.toMap(SchemaLocalAttribute::getName, a -> buildUseProperty(a, owner), throwingMerger(), LinkedHashMap::new));
    }

    static Map<QName, SchemaProperty> buildContentPropertyModelByQName(SchemaParticle part, SchemaType owner) {
        if (part == null) {
            return Collections.emptyMap();
        }

        boolean asSequence = false;
        Map<QName, SchemaProperty> model = null;

        switch (part.getParticleType()) {
            case SchemaParticle.ALL:
            case SchemaParticle.SEQUENCE:
                asSequence = true;
                break;
            case SchemaParticle.CHOICE:
                asSequence = false;
                break;
            case SchemaParticle.ELEMENT:
                model = buildElementPropertyModel((SchemaLocalElement) part, owner);
                break;
            case SchemaParticle.WILDCARD:
                model = Collections.emptyMap();
                break;
            default:
                assert (false);
                throw new IllegalStateException();
        }

        if (model == null) {
            // build model for children
            model = new LinkedHashMap<>();
            SchemaParticle[] children = part.getParticleChildren();

            for (SchemaParticle child : children) {
                // indentDBG();
                Map<QName, SchemaProperty> childModel = buildContentPropertyModelByQName(child, owner);
                // outdentDBG();
                for (SchemaProperty iProp : childModel.values()) {
                    SchemaPropertyImpl oProp = (SchemaPropertyImpl) model.get(iProp.getName());
                    if (oProp == null) {
                        if (!asSequence) {
                            ((SchemaPropertyImpl) iProp).setMinOccurs(BigInteger.ZERO);
                        }
                        model.put(iProp.getName(), iProp);
                        continue;
                    }
                    // consistency verified in an earlier step
                    assert (oProp.getType().equals(iProp.getType()));

                    mergeProperties(oProp, iProp, asSequence);
                }
            }

            // finally deal with minOccurs, maxOccurs over whole group
            BigInteger min = part.getMinOccurs();
            BigInteger max = part.getMaxOccurs();

            for (SchemaProperty oProp : model.values()) {
                BigInteger minOccurs = oProp.getMinOccurs();
                BigInteger maxOccurs = oProp.getMaxOccurs();

                minOccurs = minOccurs.multiply(min);
                if (max != null && max.equals(BigInteger.ZERO)) {
                    maxOccurs = BigInteger.ZERO;
                } else if (maxOccurs != null && !maxOccurs.equals(BigInteger.ZERO)) {
                    maxOccurs = max == null ? null : maxOccurs.multiply(max);
                }

                ((SchemaPropertyImpl) oProp).setMinOccurs(minOccurs);
                ((SchemaPropertyImpl) oProp).setMaxOccurs(maxOccurs);
            }
        }

        return model;
    }

    static Map<QName, SchemaProperty> buildElementPropertyModel(SchemaLocalElement epart, SchemaType owner) {
        SchemaProperty sProp = buildUseProperty(epart, owner);
        return Collections.singletonMap(sProp.getName(), sProp);
    }

    static SchemaProperty buildUseProperty(SchemaField use, SchemaType owner) {
        SchemaPropertyImpl sPropImpl = new SchemaPropertyImpl();
        sPropImpl.setName(use.getName());
        sPropImpl.setContainerTypeRef(owner.getRef());
        sPropImpl.setTypeRef(use.getType().getRef());
        sPropImpl.setAttribute(use.isAttribute());
        sPropImpl.setDefault(use.isDefault() ? SchemaProperty.CONSISTENTLY : SchemaProperty.NEVER);
        sPropImpl.setFixed(use.isFixed() ? SchemaProperty.CONSISTENTLY : SchemaProperty.NEVER);
        sPropImpl.setNillable(use.isNillable() ? SchemaProperty.CONSISTENTLY : SchemaProperty.NEVER);
        sPropImpl.setDefaultText(use.getDefaultText());
        sPropImpl.setMinOccurs(use.getMinOccurs());
        sPropImpl.setMaxOccurs(use.getMaxOccurs());

        if(use instanceof SchemaParticle){
            sPropImpl.setDocumentation(((SchemaParticle)use).getDocumentation());
        }

        if (use instanceof SchemaLocalElementImpl) {
            SchemaLocalElementImpl elt = (SchemaLocalElementImpl) use;
            sPropImpl.setAcceptedNames(elt.acceptedStartNames());
        }

        return sPropImpl;
    }

    static void mergeProperties(SchemaPropertyImpl into, SchemaProperty from, boolean asSequence) {
        // minoccur, maxoccur
        BigInteger minOccurs = into.getMinOccurs();
        BigInteger maxOccurs = into.getMaxOccurs();
        if (asSequence) {
            minOccurs = minOccurs.add(from.getMinOccurs());
            if (maxOccurs != null) {
                maxOccurs = (from.getMaxOccurs() == null ? null :
                    maxOccurs.add(from.getMaxOccurs()));
            }
        } else {
            minOccurs = minOccurs.min(from.getMinOccurs());
            if (maxOccurs != null) {
                maxOccurs = (from.getMaxOccurs() == null ? null :
                    maxOccurs.max(from.getMaxOccurs()));
            }
        }
        into.setMinOccurs(minOccurs);
        into.setMaxOccurs(maxOccurs);

        // nillable, default, fixed
        if (from.hasNillable() != into.hasNillable()) {
            into.setNillable(SchemaProperty.VARIABLE);
        }
        if (from.hasDefault() != into.hasDefault()) {
            into.setDefault(SchemaProperty.VARIABLE);
        }
        if (from.hasFixed() != into.hasFixed()) {
            into.setFixed(SchemaProperty.VARIABLE);
        }

        // default value
        if (into.getDefaultText() != null) {
            if (from.getDefaultText() == null ||
                !into.getDefaultText().equals(from.getDefaultText())) {
                into.setDefaultText(null);
            }
        }
    }

    static SchemaParticle[] ensureStateMachine(SchemaParticle[] children) {
        for (SchemaParticle child : children) {
            buildStateMachine(child);
        }
        return children;
    }

    static void buildStateMachine(SchemaParticle contentModel) {
        if (contentModel == null) {
            return;
        }

        SchemaParticleImpl partImpl = (SchemaParticleImpl) contentModel;
        if (partImpl.hasTransitionNotes()) {
            return;
        }

        QNameSetBuilder start = new QNameSetBuilder();
        QNameSetBuilder excludenext = new QNameSetBuilder();
        boolean deterministic = true;
        SchemaParticle[] children;
        boolean canskip = (partImpl.getMinOccurs().signum() == 0);

        switch (partImpl.getParticleType()) {
            case SchemaParticle.ELEMENT:
                // compute start and excludeNext; canskip is already correct
                if (partImpl.hasTransitionRules()) {
                    start.addAll(partImpl.acceptedStartNames());
                } else {
                    start.add(partImpl.getName());
                }

                break;

            case SchemaParticle.WILDCARD:
                // compute start and excludeNext; canskip is already correct
                start.addAll(partImpl.getWildcardSet());
                break;

            case SchemaParticle.SEQUENCE:
                children = ensureStateMachine(partImpl.getParticleChildren());

                // adjust canskip if all children are skippable
                canskip = true;
                for (int i = 0; canskip && i < children.length; i++) {
                    if (!(children[i]).isSkippable()) {
                        canskip = false;
                    }
                }

                // bubble up nondeterministic bit
                for (SchemaParticle child : children) {
                    if (!((SchemaParticleImpl) child).isDeterministic()) {
                        deterministic = false;
                        break;
                    }
                }

                // verify deterministic and compute excludeNext set
                for (int i = 1; i < children.length; i++) {
                    excludenext.addAll(((SchemaParticleImpl) children[i - 1]).getExcludeNextSet());
                    if (deterministic && !excludenext.isDisjoint((children[i]).acceptedStartNames())) {
                        deterministic = false;
                    }
                    if ((children[i]).isSkippable()) {
                        excludenext.addAll((children[i]).acceptedStartNames());
                    } else {
                        excludenext.clear();
                    }
                }

                // next, compute start set
                for (SchemaParticle child : children) {
                    start.addAll(child.acceptedStartNames());
                    if (!child.isSkippable()) {
                        break;
                    }
                }
                break;

            case SchemaParticle.CHOICE:
                children = ensureStateMachine(partImpl.getParticleChildren());

                // adjust canskip if any children are skippable
                canskip = false;
                for (SchemaParticle schemaParticle : children) {
                    if (schemaParticle.isSkippable()) {
                        canskip = true;
                        break;
                    }
                }

                // bubble up nondeterministic bit
                for (SchemaParticle child : children) {
                    if (!((SchemaParticleImpl) child).isDeterministic()) {
                        deterministic = false;
                        break;
                    }
                }

                // compute start and excludeNext sets, verify deterministic
                for (SchemaParticle child : children) {
                    if (deterministic && !start.isDisjoint(child.acceptedStartNames())) {
                        deterministic = false;
                    }
                    start.addAll(child.acceptedStartNames());
                    excludenext.addAll(((SchemaParticleImpl) child).getExcludeNextSet());
                }

                break;

            case SchemaParticle.ALL:
                children = ensureStateMachine(partImpl.getParticleChildren());

                // adjust canskip if all children are skippable
                canskip = true;
                for (SchemaParticle child : children) {
                    if (!child.isSkippable()) {
                        canskip = false;
                        break;
                    }
                }

                // bubble up nondeterministic bit
                for (SchemaParticle child : children) {
                    if (!((SchemaParticleImpl) child).isDeterministic()) {
                        deterministic = false;
                        break;
                    }
                }

                // compute start and excludeNext sets, verify deterministic
                for (SchemaParticle child : children) {
                    if (deterministic && !start.isDisjoint(child.acceptedStartNames())) {
                        deterministic = false;
                    }
                    start.addAll(child.acceptedStartNames());
                    excludenext.addAll(((SchemaParticleImpl) child).getExcludeNextSet());
                }
                if (canskip) {
                    excludenext.addAll(start);
                }

                break;

            default:
                throw new IllegalStateException("Unrecognized schema particle");
        }

        // apply looping logic

        BigInteger minOccurs = partImpl.getMinOccurs();
        BigInteger maxOccurs = partImpl.getMaxOccurs();
        boolean canloop = (maxOccurs == null || maxOccurs.compareTo(BigInteger.ONE) > 0);
        boolean varloop = (maxOccurs == null || minOccurs.compareTo(maxOccurs) < 0);

        if (canloop && deterministic && !excludenext.isDisjoint(start)) {
            // we have a possible looping nondeterminism.
            // let's take some time now to see if it's actually caused
            // by non-unique-particle-attribute or not.
            QNameSet suspectSet = excludenext.intersect(start);

            // compute the set of all particles that could start this group
            Map<SchemaParticle, QNameSet> startMap = new HashMap<>();
            particlesMatchingStart(partImpl, suspectSet, startMap, new QNameSetBuilder());

            // compute the set of all particles that could have been repeated rather than ending this group
            Map<SchemaParticle, QNameSet> afterMap = new HashMap<>();
            particlesMatchingAfter(partImpl, suspectSet, afterMap, new QNameSetBuilder(), true);

            // see if we can find a member of after that is not a member of start
            // if we can, then particle attribution is not unique
            deterministic = afterMapSubsumedByStartMap(startMap, afterMap);
        }

        if (varloop) {
            excludenext.addAll(start);
        }

        canskip = canskip || minOccurs.signum() == 0;

        partImpl.setTransitionRules(start.toQNameSet(), canskip);
        partImpl.setTransitionNotes(excludenext.toQNameSet(), deterministic);
    }

    private static boolean afterMapSubsumedByStartMap(Map<SchemaParticle, QNameSet> startMap, Map<SchemaParticle, QNameSet> afterMap) {
        if (afterMap.size() > startMap.size()) {
            return false;
        }

        if (afterMap.isEmpty()) {
            return true;
        }

        for (SchemaParticle part : startMap.keySet()) {
            if (part.getParticleType() == SchemaParticle.WILDCARD) {
                if (afterMap.containsKey(part)) {
                    QNameSet startSet = startMap.get(part);
                    QNameSet afterSet = afterMap.get(part);
                    if (!startSet.containsAll(afterSet)) {
                        return false;
                    }
                }
            }
            afterMap.remove(part);
            if (afterMap.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private static void particlesMatchingStart(SchemaParticle part, QNameSetSpecification suspectSet, Map<SchemaParticle, QNameSet> result, QNameSetBuilder eliminate) {
        switch (part.getParticleType()) {
            case SchemaParticle.ELEMENT:
                if (!suspectSet.contains(part.getName())) {
                    return;
                }
                result.put(part, null);
                eliminate.add(part.getName());
                return;

            case SchemaParticle.WILDCARD:
                if (suspectSet.isDisjoint(part.getWildcardSet())) {
                    return;
                }
                result.put(part, part.getWildcardSet().intersect(suspectSet));
                eliminate.addAll(part.getWildcardSet());
                return;

            case SchemaParticle.CHOICE:
            case SchemaParticle.ALL: {
                SchemaParticle[] children = part.getParticleChildren();
                for (SchemaParticle child : children) {
                    particlesMatchingStart(child, suspectSet, result, eliminate);
                }
                return;
            }

            case SchemaParticle.SEQUENCE: {
                SchemaParticle[] children = part.getParticleChildren();
                if (children.length == 0) {
                    return;
                }
                if (!children[0].isSkippable()) {
                    particlesMatchingStart(children[0], suspectSet, result, eliminate);
                    return;
                }
                QNameSetBuilder remainingSuspects = new QNameSetBuilder(suspectSet);
                QNameSetBuilder suspectsToEliminate = new QNameSetBuilder();
                for (SchemaParticle child : children) {
                    particlesMatchingStart(child, remainingSuspects, result, suspectsToEliminate);
                    eliminate.addAll(suspectsToEliminate);
                    if (!child.isSkippable()) {
                        return;
                    }
                    remainingSuspects.removeAll(suspectsToEliminate);
                    if (remainingSuspects.isEmpty()) {
                        return;
                    }
                    suspectsToEliminate.clear();
                }
            }
        }
    }

    private static void particlesMatchingAfter(SchemaParticle part, QNameSetSpecification suspectSet, Map<SchemaParticle, QNameSet> result, QNameSetBuilder eliminate, boolean top) {
        recurse:
        switch (part.getParticleType()) {
            case SchemaParticle.CHOICE:
            case SchemaParticle.ALL: {
                SchemaParticle[] children = part.getParticleChildren();
                for (SchemaParticle child : children) {
                    particlesMatchingAfter(child, suspectSet, result, eliminate, false);
                }
                break;
            }

            case SchemaParticle.SEQUENCE: {
                SchemaParticle[] children = part.getParticleChildren();
                if (children.length == 0) {
                    break;
                }
                if (!children[children.length - 1].isSkippable()) {
                    particlesMatchingAfter(children[0], suspectSet, result, eliminate, false);
                    break;
                }
                QNameSetBuilder remainingSuspects = new QNameSetBuilder(suspectSet);
                QNameSetBuilder suspectsToEliminate = new QNameSetBuilder();
                for (int i = children.length - 1; i >= 0; i--) {
                    particlesMatchingAfter(children[i], remainingSuspects, result, suspectsToEliminate, false);
                    eliminate.addAll(suspectsToEliminate);
                    if (!children[i].isSkippable()) {
                        break recurse;
                    }
                    remainingSuspects.removeAll(suspectsToEliminate);
                    if (remainingSuspects.isEmpty()) {
                        break recurse;
                    }
                    suspectsToEliminate.clear();
                }
                break;
            }
        }

        if (!top) {
            BigInteger minOccurs = part.getMinOccurs();
            BigInteger maxOccurs = part.getMaxOccurs();
            boolean varloop = (maxOccurs == null || minOccurs.compareTo(maxOccurs) < 0);
            if (varloop) {
                particlesMatchingStart(part, suspectSet, result, eliminate);
            }
        }
    }

    private static class CodeForNameEntry {
        CodeForNameEntry(QName name, int code) {
            this.name = name;
            this.code = code;
        }

        public QName name;
        public int code;
    }

    private static final int MODEL_GROUP_CODE = 100;

    private static final CodeForNameEntry[] particleCodes = {
        new CodeForNameEntry(QNameHelper.forLNS("all", "http://www.w3.org/2001/XMLSchema"), SchemaParticle.ALL),
        new CodeForNameEntry(QNameHelper.forLNS("sequence", "http://www.w3.org/2001/XMLSchema"), SchemaParticle.SEQUENCE),
        new CodeForNameEntry(QNameHelper.forLNS("choice", "http://www.w3.org/2001/XMLSchema"), SchemaParticle.CHOICE),
        new CodeForNameEntry(QNameHelper.forLNS("element", "http://www.w3.org/2001/XMLSchema"), SchemaParticle.ELEMENT),
        new CodeForNameEntry(QNameHelper.forLNS("any", "http://www.w3.org/2001/XMLSchema"), SchemaParticle.WILDCARD),
        new CodeForNameEntry(QNameHelper.forLNS("group", "http://www.w3.org/2001/XMLSchema"), MODEL_GROUP_CODE),
    };

    private static final Map<QName, Integer> particleCodeMap =
        Stream.of(particleCodes).collect(Collectors.toMap(pc -> pc.name, pc -> pc.code));


    private static int translateParticleCode(QName name) {
        return particleCodeMap.getOrDefault(name, 0);
    }

    private static final int ATTRIBUTE_CODE = 100;
    private static final int ATTRIBUTE_GROUP_CODE = 101;
    private static final int ANY_ATTRIBUTE_CODE = 102;

    private static final CodeForNameEntry[] attributeCodes = {
        new CodeForNameEntry(QNameHelper.forLNS("attribute", "http://www.w3.org/2001/XMLSchema"), ATTRIBUTE_CODE),
        new CodeForNameEntry(QNameHelper.forLNS("attributeGroup", "http://www.w3.org/2001/XMLSchema"), ATTRIBUTE_GROUP_CODE),
        new CodeForNameEntry(QNameHelper.forLNS("anyAttribute", "http://www.w3.org/2001/XMLSchema"), ANY_ATTRIBUTE_CODE),
    };

    private static final Map<QName,Integer> attributeCodeMap =
        Stream.of(attributeCodes).collect(Collectors.toMap(ac -> ac.name, ac -> ac.code));

    static int translateAttributeCode(QName currentName) {
        return attributeCodeMap.getOrDefault(currentName, 0);
    }
}
