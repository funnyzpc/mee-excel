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

package poi.org.apache.xmlbeans.impl.schema;

import poi.org.apache.xmlbeans.*;
import poi.org.apache.xmlbeans.SchemaAnnotation;
import poi.org.apache.xmlbeans.SchemaComponent;
import poi.org.apache.xmlbeans.SchemaIdentityConstraint;
import poi.org.apache.xmlbeans.SchemaModelGroup;
import poi.org.apache.xmlbeans.SchemaParticle;
import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SchemaTypeSystem;
import poi.org.apache.xmlbeans.impl.common.QNameHelper;
import poi.org.apache.xmlbeans.impl.regex.SchemaRegularExpression;
import poi.org.apache.xmlbeans.impl.values.XmlIntegerImpl;
import poi.org.apache.xmlbeans.impl.values.XmlStringImpl;
import poi.org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;
import poi.org.apache.xmlbeans.QNameSet;
import poi.org.apache.xmlbeans.SchemaAttributeGroup;
import poi.org.apache.xmlbeans.SchemaAttributeModel;
import poi.org.apache.xmlbeans.SchemaGlobalAttribute;
import poi.org.apache.xmlbeans.SchemaGlobalElement;
import poi.org.apache.xmlbeans.impl.regex.ParseException;
import poi.org.apache.xmlbeans.impl.regex.RegularExpression;

import javax.xml.namespace.QName;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BuiltinSchemaTypeSystem extends SchemaTypeLoaderBase implements SchemaTypeSystem
{
    // The global builtin type system
    public static SchemaTypeSystem get()
        { return _global; }

    // some constants that need to be initialized early
    private static final SchemaType[] EMPTY_SCHEMATYPE_ARRAY = new SchemaType[0];
    private static final SchemaType.Ref[] EMPTY_SCHEMATYPEREF_ARRAY = new SchemaType.Ref[0];
    private static final SchemaGlobalElement[] EMPTY_SCHEMAELEMENT_ARRAY = new SchemaGlobalElement[0];
    private static final SchemaGlobalAttribute[] EMPTY_SCHEMAATTRIBUTE_ARRAY = new SchemaGlobalAttribute[0];
    private static final SchemaModelGroup[] EMPTY_SCHEMAMODELGROUP_ARRAY = new SchemaModelGroup[0];
    private static final SchemaAttributeGroup[] EMPTY_SCHEMAATTRIBUTEGROUP_ARRAY = new SchemaAttributeGroup[0];
    private static final SchemaAnnotation[] EMPTY_SCHEMAANNOTATION_ARRAY = new SchemaAnnotation[0];

    private static BuiltinSchemaTypeSystem _global = new BuiltinSchemaTypeSystem();

    // UR types
    public static final SchemaTypeImpl ST_ANY_TYPE = _global.getBuiltinType(SchemaType.BTC_ANY_TYPE);
    public static final SchemaTypeImpl ST_ANY_SIMPLE = _global.getBuiltinType(SchemaType.BTC_ANY_SIMPLE);

    // primitives
    public static final SchemaTypeImpl ST_BOOLEAN = _global.getBuiltinType(SchemaType.BTC_BOOLEAN);
    public static final SchemaTypeImpl ST_BASE_64_BINARY = _global.getBuiltinType(SchemaType.BTC_BASE_64_BINARY);
    public static final SchemaTypeImpl ST_HEX_BINARY = _global.getBuiltinType(SchemaType.BTC_HEX_BINARY);
    public static final SchemaTypeImpl ST_ANY_URI = _global.getBuiltinType(SchemaType.BTC_ANY_URI);
    public static final SchemaTypeImpl ST_QNAME = _global.getBuiltinType(SchemaType.BTC_QNAME);
    public static final SchemaTypeImpl ST_NOTATION = _global.getBuiltinType(SchemaType.BTC_NOTATION);
    public static final SchemaTypeImpl ST_FLOAT = _global.getBuiltinType(SchemaType.BTC_FLOAT);
    public static final SchemaTypeImpl ST_DOUBLE = _global.getBuiltinType(SchemaType.BTC_DOUBLE);
    public static final SchemaTypeImpl ST_DECIMAL = _global.getBuiltinType(SchemaType.BTC_DECIMAL);
    public static final SchemaTypeImpl ST_STRING = _global.getBuiltinType(SchemaType.BTC_STRING);

    public static final SchemaTypeImpl ST_DURATION = _global.getBuiltinType(SchemaType.BTC_DURATION);
    public static final SchemaTypeImpl ST_DATE_TIME = _global.getBuiltinType(SchemaType.BTC_DATE_TIME);
    public static final SchemaTypeImpl ST_TIME = _global.getBuiltinType(SchemaType.BTC_TIME);
    public static final SchemaTypeImpl ST_DATE = _global.getBuiltinType(SchemaType.BTC_DATE);
    public static final SchemaTypeImpl ST_G_YEAR_MONTH = _global.getBuiltinType(SchemaType.BTC_G_YEAR_MONTH);
    public static final SchemaTypeImpl ST_G_YEAR = _global.getBuiltinType(SchemaType.BTC_G_YEAR);
    public static final SchemaTypeImpl ST_G_MONTH_DAY = _global.getBuiltinType(SchemaType.BTC_G_MONTH_DAY);
    public static final SchemaTypeImpl ST_G_DAY = _global.getBuiltinType(SchemaType.BTC_G_DAY);
    public static final SchemaTypeImpl ST_G_MONTH = _global.getBuiltinType(SchemaType.BTC_G_MONTH);

    // derived numerics
    public static final SchemaTypeImpl ST_INTEGER = _global.getBuiltinType(SchemaType.BTC_INTEGER);
    public static final SchemaTypeImpl ST_LONG = _global.getBuiltinType(SchemaType.BTC_LONG);
    public static final SchemaTypeImpl ST_INT = _global.getBuiltinType(SchemaType.BTC_INT);
    public static final SchemaTypeImpl ST_SHORT = _global.getBuiltinType(SchemaType.BTC_SHORT);
    public static final SchemaTypeImpl ST_BYTE = _global.getBuiltinType(SchemaType.BTC_BYTE);
    public static final SchemaTypeImpl ST_NON_POSITIVE_INTEGER = _global.getBuiltinType(SchemaType.BTC_NON_POSITIVE_INTEGER);
    public static final SchemaTypeImpl ST_NEGATIVE_INTEGER = _global.getBuiltinType(SchemaType.BTC_NEGATIVE_INTEGER);
    public static final SchemaTypeImpl ST_NON_NEGATIVE_INTEGER = _global.getBuiltinType(SchemaType.BTC_NON_NEGATIVE_INTEGER);
    public static final SchemaTypeImpl ST_POSITIVE_INTEGER = _global.getBuiltinType(SchemaType.BTC_POSITIVE_INTEGER);
    public static final SchemaTypeImpl ST_UNSIGNED_LONG = _global.getBuiltinType(SchemaType.BTC_UNSIGNED_LONG);
    public static final SchemaTypeImpl ST_UNSIGNED_INT = _global.getBuiltinType(SchemaType.BTC_UNSIGNED_INT);
    public static final SchemaTypeImpl ST_UNSIGNED_SHORT = _global.getBuiltinType(SchemaType.BTC_UNSIGNED_SHORT);
    public static final SchemaTypeImpl ST_UNSIGNED_BYTE = _global.getBuiltinType(SchemaType.BTC_UNSIGNED_BYTE);

    // derived strings
    public static final SchemaTypeImpl ST_NORMALIZED_STRING = _global.getBuiltinType(SchemaType.BTC_NORMALIZED_STRING);
    public static final SchemaTypeImpl ST_TOKEN = _global.getBuiltinType(SchemaType.BTC_TOKEN);
    public static final SchemaTypeImpl ST_NAME = _global.getBuiltinType(SchemaType.BTC_NAME);
    public static final SchemaTypeImpl ST_NCNAME = _global.getBuiltinType(SchemaType.BTC_NCNAME);
    public static final SchemaTypeImpl ST_LANGUAGE = _global.getBuiltinType(SchemaType.BTC_LANGUAGE);
    public static final SchemaTypeImpl ST_ID = _global.getBuiltinType(SchemaType.BTC_ID);
    public static final SchemaTypeImpl ST_IDREF = _global.getBuiltinType(SchemaType.BTC_IDREF);
    public static final SchemaTypeImpl ST_IDREFS = _global.getBuiltinType(SchemaType.BTC_IDREFS);
    public static final SchemaTypeImpl ST_ENTITY = _global.getBuiltinType(SchemaType.BTC_ENTITY);
    public static final SchemaTypeImpl ST_ENTITIES = _global.getBuiltinType(SchemaType.BTC_ENTITIES);
    public static final SchemaTypeImpl ST_NMTOKEN = _global.getBuiltinType(SchemaType.BTC_NMTOKEN);
    public static final SchemaTypeImpl ST_NMTOKENS = _global.getBuiltinType(SchemaType.BTC_NMTOKENS);

    // the no-type
    public static final SchemaTypeImpl ST_NO_TYPE = _global.getBuiltinType(SchemaType.BTC_NOT_BUILTIN);

    private final static XmlValueRef XMLSTR_PRESERVE = buildString("preserve");
    private final static XmlValueRef XMLSTR_REPLACE = buildString("preserve");
    private final static XmlValueRef XMLSTR_COLLAPSE = buildString("preserve");

    private final static XmlValueRef[] FACETS_NONE = new XmlValueRef[]
        { null, null, null, null, null, null, null, null, null,
          null, null, null };

    private final static boolean[] FIXED_FACETS_NONE = new boolean[]
        { false, false, false, false, false, false, false, false, false,
          false, false, false };

    private final static XmlValueRef[] FACETS_WS_COLLAPSE = new XmlValueRef[]
        { null, null, null, null, null, null, null, null, null,
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_WS_REPLACE = new XmlValueRef[]
        { null, null, null, null, null, null, null, null, null,
          build_wsstring(SchemaType.WS_REPLACE), null, null };

    private final static XmlValueRef[] FACETS_WS_PRESERVE = new XmlValueRef[]
        { null, null, null, null, null, null, null, null, null,
          build_wsstring(SchemaType.WS_PRESERVE), null, null };

    private final static XmlValueRef[] FACETS_INTEGER = new XmlValueRef[]
        { null, null, null, null, null, null, null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_LONG = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.valueOf(Long.MIN_VALUE)), buildInteger(BigInteger.valueOf(Long.MAX_VALUE)), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_INT = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.valueOf(Integer.MIN_VALUE)), buildInteger(BigInteger.valueOf(Integer.MAX_VALUE)), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_SHORT = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.valueOf(Short.MIN_VALUE)), buildInteger(BigInteger.valueOf(Short.MAX_VALUE)), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_BYTE = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.valueOf(Byte.MIN_VALUE)), buildInteger(BigInteger.valueOf(Byte.MAX_VALUE)), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_NONNEGATIVE = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.ZERO), null, null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_POSITIVE = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.ONE), null, null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_NONPOSITIVE = new XmlValueRef[]
        { null, null, null, null, null, buildInteger(BigInteger.ZERO), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_NEGATIVE = new XmlValueRef[]
        { null, null, null, null, null, buildInteger(BigInteger.ONE.negate()), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_UNSIGNED_LONG = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.ZERO), buildInteger(new BigInteger("18446744073709551615")), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_UNSIGNED_INT = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.ZERO), buildInteger(BigInteger.valueOf(4294967295L)), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_UNSIGNED_SHORT = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.ZERO), buildInteger(BigInteger.valueOf(65535)), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_UNSIGNED_BYTE = new XmlValueRef[]
        { null, null, null, null, buildInteger(BigInteger.ZERO), buildInteger(BigInteger.valueOf(255)), null, null, buildNnInteger(BigInteger.ZERO),
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static XmlValueRef[] FACETS_BUILTIN_LIST = new XmlValueRef[]
        { null, buildNnInteger(BigInteger.ONE), null, null, null, null, null, null, null,
          build_wsstring(SchemaType.WS_COLLAPSE), null, null };

    private final static boolean[] FIXED_FACETS_WS = new boolean[]
        { false, false, false, false, false, false, false, false, false,
          true, false, false };

    private final static boolean[] FIXED_FACETS_INTEGER = new boolean[]
        { false, false, false, false, false, false, false, false, true,
          true, false, false };

    final static XmlValueRef[] FACETS_UNION = FACETS_NONE;
    final static boolean[] FIXED_FACETS_UNION = FIXED_FACETS_NONE;

    final static XmlValueRef[] FACETS_LIST = FACETS_WS_COLLAPSE;
    final static boolean[] FIXED_FACETS_LIST = FIXED_FACETS_WS;


    /*
     * LAST Static initializer
     */
    static {
        for (int i = SchemaType.BTC_NOT_BUILTIN; i <= SchemaType.BTC_LAST_BUILTIN; i++)
        {
            _global.fillInType(i);
        }
    }

    private Map<QName, SchemaType> _typeMap = new HashMap<>();
    private SchemaTypeImpl[] _typeArray = new SchemaTypeImpl[SchemaType.BTC_LAST_BUILTIN + 1];
    private Map<String, SchemaType> _handlesToObjects = new HashMap<>();
    private Map<SchemaType, String> _objectsToHandles = new HashMap<>();
    private Map<String, SchemaType> _typesByClassname = new HashMap<>();
    private SchemaContainer _container = new SchemaContainer("http://www.w3.org/2001/XMLSchema");

    private SchemaTypeImpl getBuiltinType(int btc)
    {
        return _typeArray[btc];
    }

    private BuiltinSchemaTypeSystem()
    {
        _container.setTypeSystem(this);
        // UR types
        setupBuiltin(SchemaType.BTC_ANY_TYPE, "anyType", "org.apache.xmlbeans.XmlObject");
        setupBuiltin(SchemaType.BTC_ANY_SIMPLE, "anySimpleType", "org.apache.xmlbeans.XmlAnySimpleType");

        // primitives
        setupBuiltin(SchemaType.BTC_BOOLEAN, "boolean", "org.apache.xmlbeans.XmlBoolean");
        setupBuiltin(SchemaType.BTC_BASE_64_BINARY, "base64Binary", "org.apache.xmlbeans.XmlBase64Binary");
        setupBuiltin(SchemaType.BTC_HEX_BINARY, "hexBinary", "org.apache.xmlbeans.XmlHexBinary");
        setupBuiltin(SchemaType.BTC_ANY_URI, "anyURI", "org.apache.xmlbeans.XmlAnyURI");
        setupBuiltin(SchemaType.BTC_QNAME, "QName", "org.apache.xmlbeans.XmlQName");
        setupBuiltin(SchemaType.BTC_NOTATION, "NOTATION", "org.apache.xmlbeans.XmlNOTATION");
        setupBuiltin(SchemaType.BTC_FLOAT, "float", "org.apache.xmlbeans.XmlFloat");
        setupBuiltin(SchemaType.BTC_DOUBLE, "double", "org.apache.xmlbeans.XmlDouble");
        setupBuiltin(SchemaType.BTC_DECIMAL, "decimal", "org.apache.xmlbeans.XmlDecimal");
        setupBuiltin(SchemaType.BTC_STRING, "string", "org.apache.xmlbeans.XmlString");

        setupBuiltin(SchemaType.BTC_DURATION, "duration", "org.apache.xmlbeans.XmlDuration");
        setupBuiltin(SchemaType.BTC_DATE_TIME, "dateTime", "org.apache.xmlbeans.XmlDateTime");
        setupBuiltin(SchemaType.BTC_TIME, "time", "org.apache.xmlbeans.XmlTime");
        setupBuiltin(SchemaType.BTC_DATE, "date", "org.apache.xmlbeans.XmlDate");
        setupBuiltin(SchemaType.BTC_G_YEAR_MONTH, "gYearMonth", "org.apache.xmlbeans.XmlGYearMonth");
        setupBuiltin(SchemaType.BTC_G_YEAR, "gYear", "org.apache.xmlbeans.XmlGYear");
        setupBuiltin(SchemaType.BTC_G_MONTH_DAY, "gMonthDay", "org.apache.xmlbeans.XmlGMonthDay");
        setupBuiltin(SchemaType.BTC_G_DAY, "gDay", "org.apache.xmlbeans.XmlGDay");
        setupBuiltin(SchemaType.BTC_G_MONTH, "gMonth", "org.apache.xmlbeans.XmlGMonth");

        // derived numerics
        setupBuiltin(SchemaType.BTC_INTEGER, "integer", "org.apache.xmlbeans.XmlInteger");
        setupBuiltin(SchemaType.BTC_LONG, "long", "org.apache.xmlbeans.XmlLong");
        setupBuiltin(SchemaType.BTC_INT, "int", "org.apache.xmlbeans.XmlInt");
        setupBuiltin(SchemaType.BTC_SHORT, "short", "org.apache.xmlbeans.XmlShort");
        setupBuiltin(SchemaType.BTC_BYTE, "byte", "org.apache.xmlbeans.XmlByte");
        setupBuiltin(SchemaType.BTC_NON_POSITIVE_INTEGER, "nonPositiveInteger", "org.apache.xmlbeans.XmlNonPositiveInteger");
        setupBuiltin(SchemaType.BTC_NEGATIVE_INTEGER, "negativeInteger", "org.apache.xmlbeans.XmlNegativeInteger");
        setupBuiltin(SchemaType.BTC_NON_NEGATIVE_INTEGER, "nonNegativeInteger", "org.apache.xmlbeans.XmlNonNegativeInteger");
        setupBuiltin(SchemaType.BTC_POSITIVE_INTEGER, "positiveInteger", "org.apache.xmlbeans.XmlPositiveInteger");
        setupBuiltin(SchemaType.BTC_UNSIGNED_LONG, "unsignedLong", "org.apache.xmlbeans.XmlUnsignedLong");
        setupBuiltin(SchemaType.BTC_UNSIGNED_INT, "unsignedInt", "org.apache.xmlbeans.XmlUnsignedInt");
        setupBuiltin(SchemaType.BTC_UNSIGNED_SHORT, "unsignedShort", "org.apache.xmlbeans.XmlUnsignedShort");
        setupBuiltin(SchemaType.BTC_UNSIGNED_BYTE, "unsignedByte", "org.apache.xmlbeans.XmlUnsignedByte");

        // derived strings
        setupBuiltin(SchemaType.BTC_NORMALIZED_STRING, "normalizedString", "org.apache.xmlbeans.XmlNormalizedString");
        setupBuiltin(SchemaType.BTC_TOKEN, "token", "org.apache.xmlbeans.XmlToken");
        setupBuiltin(SchemaType.BTC_NAME, "Name", "org.apache.xmlbeans.XmlName");
        setupBuiltin(SchemaType.BTC_NCNAME, "NCName", "org.apache.xmlbeans.XmlNCName");
        setupBuiltin(SchemaType.BTC_LANGUAGE, "language", "org.apache.xmlbeans.XmlLanguage");
        setupBuiltin(SchemaType.BTC_ID, "ID", "org.apache.xmlbeans.XmlID");
        setupBuiltin(SchemaType.BTC_IDREF, "IDREF", "org.apache.xmlbeans.XmlIDREF");
        setupBuiltin(SchemaType.BTC_IDREFS, "IDREFS", "org.apache.xmlbeans.XmlIDREFS");
        setupBuiltin(SchemaType.BTC_ENTITY, "ENTITY", "org.apache.xmlbeans.XmlENTITY");
        setupBuiltin(SchemaType.BTC_ENTITIES, "ENTITIES", "org.apache.xmlbeans.XmlENTITIES");
        setupBuiltin(SchemaType.BTC_NMTOKEN, "NMTOKEN", "org.apache.xmlbeans.XmlNMTOKEN");
        setupBuiltin(SchemaType.BTC_NMTOKENS, "NMTOKENS", "org.apache.xmlbeans.XmlNMTOKENS");

        // the no-type
        setupBuiltin(SchemaType.BTC_NOT_BUILTIN, null, null);
        _container.setImmutable();
    }


    /**
     * Returns the name of this loader.
     */
    public String getName()
    {
        return "schema.typesystem.builtin";
    }

    public boolean isNamespaceDefined(String namespace)
    {
        return namespace.equals("http://www.w3.org/2001/XMLSchema");
    }

    public SchemaType findType(QName name)
    {
        return _typeMap.get(name);
    }


    public SchemaType findDocumentType(QName name)
    {
        return null;
    }

    public SchemaType findAttributeType(QName name)
    {
        return null;
    }

    public SchemaGlobalElement findElement(QName name)
    {
        return null;
    }

    public SchemaGlobalAttribute findAttribute(QName name)
    {
        return null;
    }

    public SchemaType.Ref findTypeRef(QName name)
    {
        SchemaType type = findType(name);
        return (type == null ? null : type.getRef());
    }

    public SchemaType.Ref findDocumentTypeRef(QName name)
    {
        return null;
    }

    public SchemaType.Ref findAttributeTypeRef(QName name)
    {
        return null;
    }

    public SchemaGlobalElement.Ref findElementRef(QName name)
    {
        return null;
    }

    public SchemaGlobalAttribute.Ref findAttributeRef(QName name)
    {
        return null;
    }

    public SchemaModelGroup.Ref findModelGroupRef(QName name)
    {
        return null;
    }

    public SchemaAttributeGroup.Ref findAttributeGroupRef(QName name)
    {
        return null;
    }

    public SchemaIdentityConstraint.Ref findIdentityConstraintRef(QName name)
    {
        return null;
    }

    public SchemaType typeForClassname(String classname)
    {
        return _typesByClassname.get(classname);
    }

    public InputStream getSourceAsStream(String sourceName)
    {
        return null; // builtin schema type system has no source.
    }

    /**
     * Returns the global types defined in this loader.
     */
    public SchemaType[] globalTypes()
    {
        SchemaType[] result = new SchemaType[_typeArray.length - 1];
        System.arraycopy(_typeArray, 1, result, 0, result.length);
        return result;
    }

    /**
     * Returns the document types defined in this loader.
     */
    public SchemaType[] documentTypes()
    {
        return EMPTY_SCHEMATYPE_ARRAY;
    }

    /**
     * Returns the attribute types defined in this loader.
     */
    public SchemaType[] attributeTypes()
    {
        return EMPTY_SCHEMATYPE_ARRAY;
    }

    /**
     * Returns the global elements defined in this loader.
     */
    public SchemaGlobalElement[] globalElements()
    {
        return EMPTY_SCHEMAELEMENT_ARRAY;
    }

    /**
     * Returns the global attributes defined in this loader.
     */
    public SchemaGlobalAttribute[] globalAttributes()
    {
        return EMPTY_SCHEMAATTRIBUTE_ARRAY;
    }

    /**
     * Returns the model groups defined in this loader.
     */
    public SchemaModelGroup[] modelGroups()
    {
        return EMPTY_SCHEMAMODELGROUP_ARRAY;
    }

    /**
     * Returns the attribute groups defined in this loader.
     */
    public SchemaAttributeGroup[] attributeGroups()
    {
        return EMPTY_SCHEMAATTRIBUTEGROUP_ARRAY;
    }

    /*
     * Returns the top-level annotations.
     */
    public SchemaAnnotation[] annotations()
    {
        return EMPTY_SCHEMAANNOTATION_ARRAY;
    }

    /**
     * Returns the handle for the given type within this loader.
     */
    public String handleForType(SchemaType type)
    {
        return _objectsToHandles.get(type);
    }

    /**
     * Returns the classloader used by this loader for resolving types.
     */
    public ClassLoader getClassLoader()
    {
        return BuiltinSchemaTypeSystem.class.getClassLoader();
    }


    private static XmlValueRef build_wsstring(int wsr)
    {
        switch (wsr)
        {
            case SchemaType.WS_PRESERVE:
                return XMLSTR_PRESERVE;
            case SchemaType.WS_REPLACE:
                return XMLSTR_REPLACE;
            case SchemaType.WS_COLLAPSE:
                return XMLSTR_COLLAPSE;
        }
        return null;
    }

    private static XmlValueRef buildNnInteger(BigInteger bigInt)
    {
        if (bigInt == null)
            return null;
        if (bigInt.signum() < 0)
            return null;
        try
        {
            XmlIntegerImpl i = new XmlIntegerImpl();
            i.setBigIntegerValue(bigInt);
            i.setImmutable();
            return new XmlValueRef(i);
        }
        catch (XmlValueOutOfRangeException e)
        {
            return null;
        }
    }

    private static XmlValueRef buildInteger(BigInteger bigInt)
    {
        if (bigInt == null)
            return null;
        try
        {
            XmlIntegerImpl i = new XmlIntegerImpl();
            i.setBigIntegerValue(bigInt);
            i.setImmutable();
            return new XmlValueRef(i);
        }
        catch (XmlValueOutOfRangeException e)
        {
            return null;
        }
    }

    private static XmlValueRef buildString(String str)
    {
        if (str == null)
            return null;

        try
        {
            XmlStringImpl i = new XmlStringImpl();
            i.setStringValue(str);
            i.setImmutable();
            return new XmlValueRef(i);
        }
        catch (XmlValueOutOfRangeException e)
        {
            return null;
        }
    }

    private void setupBuiltin(int btc, String localname, String classname)
    {
        SchemaTypeImpl result = new SchemaTypeImpl(_container, true);
        _container.addGlobalType(result.getRef());
        QName name = localname == null ? null : QNameHelper.forLNS(localname, "http://www.w3.org/2001/XMLSchema");
        String handle = "_BI_" + (localname == null ? "NO_TYPE" : localname);
        result.setName(name);
        result.setBuiltinTypeCode(btc);
        if (classname != null)
            result.setFullJavaName(classname);

        _typeArray[btc] = result;
        _typeMap.put(name, result);
        _handlesToObjects.put(handle, result);
        _objectsToHandles.put(result, handle);
        if (classname != null)
            _typesByClassname.put(classname, result);
    }

    public void resolve()
    {
        // we're born resolved and don't need to do anything.
    }

    public SchemaType typeForHandle(String handle)
    {
        return _handlesToObjects.get(handle);
    }

    public SchemaComponent resolveHandle(String handle) { return _handlesToObjects.get(handle); }

    /**
     * Links a type.
     */
    public void fillInType(int btc)
    {
        SchemaTypeImpl result = getBuiltinType(btc);
        SchemaType base;
        SchemaType item = null;
        int variety = SchemaType.ATOMIC;
        int derivationType = SchemaType.DT_RESTRICTION;

        switch (btc)
        {
            case SchemaType.BTC_NOT_BUILTIN:
                variety = SchemaType.NOT_SIMPLE;
                base = ST_ANY_TYPE;
                break;

            case SchemaType.BTC_ANY_TYPE:
                variety = SchemaType.NOT_SIMPLE;
                base = null;
                derivationType = SchemaType.DT_RESTRICTION;
                break;

            default:
                assert(false);

            case SchemaType.BTC_ANY_SIMPLE:
                base = ST_ANY_TYPE; break;

            case SchemaType.BTC_BOOLEAN:
            case SchemaType.BTC_BASE_64_BINARY:
            case SchemaType.BTC_HEX_BINARY:
            case SchemaType.BTC_ANY_URI:
            case SchemaType.BTC_QNAME:
            case SchemaType.BTC_NOTATION:
            case SchemaType.BTC_FLOAT:
            case SchemaType.BTC_DOUBLE:
            case SchemaType.BTC_DECIMAL:
            case SchemaType.BTC_STRING:
            case SchemaType.BTC_DURATION:
            case SchemaType.BTC_DATE_TIME:
            case SchemaType.BTC_TIME:
            case SchemaType.BTC_DATE:
            case SchemaType.BTC_G_YEAR_MONTH:
            case SchemaType.BTC_G_YEAR:
            case SchemaType.BTC_G_MONTH_DAY:
            case SchemaType.BTC_G_DAY:
            case SchemaType.BTC_G_MONTH:
                base = ST_ANY_SIMPLE; break;

            // derived numerics
            case SchemaType.BTC_INTEGER:
                base = ST_DECIMAL; break;

            case SchemaType.BTC_LONG:
                base = ST_INTEGER; break;

            case SchemaType.BTC_INT:
                base = ST_LONG; break;

            case SchemaType.BTC_SHORT:
                base = ST_INT; break;

            case SchemaType.BTC_BYTE:
                base = ST_SHORT; break;

            case SchemaType.BTC_NON_POSITIVE_INTEGER:
                base = ST_INTEGER; break;

            case SchemaType.BTC_NEGATIVE_INTEGER:
                base = ST_NON_POSITIVE_INTEGER; break;

            case SchemaType.BTC_NON_NEGATIVE_INTEGER:
                base = ST_INTEGER; break;

            case SchemaType.BTC_POSITIVE_INTEGER:
                base = ST_NON_NEGATIVE_INTEGER; break;

            case SchemaType.BTC_UNSIGNED_LONG:
                base = ST_NON_NEGATIVE_INTEGER; break;

            case SchemaType.BTC_UNSIGNED_INT:
                base = ST_UNSIGNED_LONG; break;

            case SchemaType.BTC_UNSIGNED_SHORT:
                base = ST_UNSIGNED_INT; break;

            case SchemaType.BTC_UNSIGNED_BYTE:
                base = ST_UNSIGNED_SHORT; break;

            // derived strings
            case SchemaType.BTC_NORMALIZED_STRING:
                base = ST_STRING; break;

            case SchemaType.BTC_TOKEN:
                base = ST_NORMALIZED_STRING; break;

            case SchemaType.BTC_NAME:
                base = ST_TOKEN; break;

            case SchemaType.BTC_NCNAME:
                base = ST_NAME; break;

            case SchemaType.BTC_ID:
            case SchemaType.BTC_IDREF:
            case SchemaType.BTC_ENTITY:
                base = ST_NCNAME; break;

            case SchemaType.BTC_LANGUAGE:
            case SchemaType.BTC_NMTOKEN:
                base = ST_TOKEN; break;

            case SchemaType.BTC_IDREFS:
            case SchemaType.BTC_ENTITIES:
            case SchemaType.BTC_NMTOKENS:
                variety = SchemaType.LIST;
                base = ST_ANY_SIMPLE;
                if (btc == SchemaType.BTC_IDREFS)
                    item = ST_IDREF;
                else if (btc == SchemaType.BTC_ENTITIES)
                    item = ST_ENTITY;
                else
                    item = ST_NMTOKEN;
                break;
        }

        result.setDerivationType(derivationType);
        result.setSimpleTypeVariety(variety);
        if (variety != SchemaType.NOT_SIMPLE)
        {
            result.setSimpleType(true);
        }
        else
        {
            assert (btc == SchemaType.BTC_ANY_TYPE || btc == SchemaType.BTC_NOT_BUILTIN);
        }
        result.setBaseTypeRef(base == null ? null : base.getRef());
        result.setBaseDepth(base == null ? 0 : ((SchemaTypeImpl)base).getBaseDepth() + 1);
        result.setListItemTypeRef(item == null ? null : item.getRef());
        if (btc >= SchemaType.BTC_FIRST_PRIMITIVE && btc <= SchemaType.BTC_LAST_PRIMITIVE)
            result.setPrimitiveTypeRef(result.getRef());
        else if (variety == SchemaType.ATOMIC)
        {
            if (base == null)
                throw new IllegalStateException("Base was null for " + btc);
            if (base.getPrimitiveType() == null)
                throw new IllegalStateException("Base.gpt was null for " + btc);
            result.setPrimitiveTypeRef(base.getPrimitiveType().getRef());
        }

        XmlValueRef[] facets;
        boolean[] fixedf;
        int wsr = SchemaType.WS_COLLAPSE;
        int decimalSize = SchemaType.NOT_DECIMAL;

        // now set up facets
        switch (btc)
        {
            default:
                assert(false);

            case SchemaType.BTC_ANY_TYPE:
            case SchemaType.BTC_ANY_SIMPLE:
            case SchemaType.BTC_NOT_BUILTIN:
                facets = FACETS_NONE;
                fixedf = FIXED_FACETS_NONE;
                wsr = SchemaType.WS_UNSPECIFIED;
                break;

            case SchemaType.BTC_STRING:
                facets = FACETS_WS_PRESERVE;
                fixedf = FIXED_FACETS_NONE;
                wsr = SchemaType.WS_PRESERVE;
                break;

            case SchemaType.BTC_BOOLEAN:
            case SchemaType.BTC_BASE_64_BINARY:
            case SchemaType.BTC_HEX_BINARY:
            case SchemaType.BTC_ANY_URI:
            case SchemaType.BTC_QNAME:
            case SchemaType.BTC_FLOAT:
            case SchemaType.BTC_DOUBLE:
            case SchemaType.BTC_NOTATION:
            case SchemaType.BTC_DURATION:
            case SchemaType.BTC_DATE_TIME:
            case SchemaType.BTC_TIME:
            case SchemaType.BTC_DATE:
            case SchemaType.BTC_G_YEAR_MONTH:
            case SchemaType.BTC_G_YEAR:
            case SchemaType.BTC_G_MONTH_DAY:
            case SchemaType.BTC_G_DAY:
            case SchemaType.BTC_G_MONTH:
                facets = FACETS_WS_COLLAPSE;
                fixedf = FIXED_FACETS_WS;
                break;

            case SchemaType.BTC_DECIMAL:
                facets = FACETS_WS_COLLAPSE;
                fixedf = FIXED_FACETS_WS;
                decimalSize = SchemaType.SIZE_BIG_DECIMAL;
                break;

            // derived numerics
            case SchemaType.BTC_INTEGER:
                facets = FACETS_INTEGER;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_BIG_INTEGER;
                break;

            case SchemaType.BTC_LONG:
                facets = FACETS_LONG;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_LONG;
                break;

            case SchemaType.BTC_INT:
                facets = FACETS_INT;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_INT;
                break;

            case SchemaType.BTC_SHORT:
                facets = FACETS_SHORT;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_SHORT;
                break;

            case SchemaType.BTC_BYTE:
                facets = FACETS_BYTE;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_BYTE;
                break;

            case SchemaType.BTC_NON_POSITIVE_INTEGER:
                facets = FACETS_NONPOSITIVE;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_BIG_INTEGER;
                break;

            case SchemaType.BTC_NEGATIVE_INTEGER:
                facets = FACETS_NEGATIVE;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_BIG_INTEGER;
                break;

            case SchemaType.BTC_NON_NEGATIVE_INTEGER:
                facets = FACETS_NONNEGATIVE;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_BIG_INTEGER;
                break;

            case SchemaType.BTC_POSITIVE_INTEGER:
                facets = FACETS_POSITIVE;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_BIG_INTEGER;
                break;

            case SchemaType.BTC_UNSIGNED_LONG:
                facets = FACETS_UNSIGNED_LONG;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_BIG_INTEGER;
                break;

            case SchemaType.BTC_UNSIGNED_INT:
                facets = FACETS_UNSIGNED_INT;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_LONG;
                break;

            case SchemaType.BTC_UNSIGNED_SHORT:
                facets = FACETS_UNSIGNED_SHORT;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_INT;
                break;

            case SchemaType.BTC_UNSIGNED_BYTE:
                facets = FACETS_UNSIGNED_BYTE;
                fixedf = FIXED_FACETS_INTEGER;
                decimalSize = SchemaType.SIZE_SHORT;
                break;


            // derived strings
            case SchemaType.BTC_NORMALIZED_STRING:
                facets = FACETS_WS_REPLACE;
                fixedf = FIXED_FACETS_NONE;
                wsr = SchemaType.WS_REPLACE;
                break;

            case SchemaType.BTC_TOKEN:
            case SchemaType.BTC_NAME:
            case SchemaType.BTC_NCNAME:
            case SchemaType.BTC_LANGUAGE:
            case SchemaType.BTC_ID:
            case SchemaType.BTC_IDREF:
            case SchemaType.BTC_IDREFS:
            case SchemaType.BTC_ENTITY:
            case SchemaType.BTC_NMTOKEN:
                facets = FACETS_WS_COLLAPSE;
                fixedf = FIXED_FACETS_NONE;
                wsr = SchemaType.WS_COLLAPSE;
                break;

            case SchemaType.BTC_ENTITIES:
            case SchemaType.BTC_NMTOKENS:
                facets = FACETS_BUILTIN_LIST;
                fixedf = FIXED_FACETS_NONE;
                wsr = SchemaType.WS_UNSPECIFIED;
                break;
        }

        // fundamental facets
        int ordered = SchemaType.UNORDERED;
        boolean isNumeric = false;
        boolean isFinite = false;
        boolean isBounded = false;

        switch (btc)
        {
            default:
                assert(false);

            case SchemaType.BTC_ANY_TYPE:
            case SchemaType.BTC_NOT_BUILTIN:
            case SchemaType.BTC_ANY_SIMPLE:
            case SchemaType.BTC_STRING:
            case SchemaType.BTC_BASE_64_BINARY:
            case SchemaType.BTC_HEX_BINARY:
            case SchemaType.BTC_ANY_URI:
            case SchemaType.BTC_QNAME:
            case SchemaType.BTC_NOTATION:
            case SchemaType.BTC_NORMALIZED_STRING:
            case SchemaType.BTC_TOKEN:
            case SchemaType.BTC_NAME:
            case SchemaType.BTC_NCNAME:
            case SchemaType.BTC_LANGUAGE:
            case SchemaType.BTC_ID:
            case SchemaType.BTC_IDREF:
            case SchemaType.BTC_IDREFS:
            case SchemaType.BTC_ENTITY:
            case SchemaType.BTC_NMTOKEN:
            case SchemaType.BTC_ENTITIES:
            case SchemaType.BTC_NMTOKENS:
                break;

            case SchemaType.BTC_BOOLEAN:
                isFinite = true;
                break;


            case SchemaType.BTC_FLOAT:
            case SchemaType.BTC_DOUBLE:
            case SchemaType.BTC_DECIMAL:
            case SchemaType.BTC_INTEGER:
                isNumeric = true;
                ordered = SchemaType.TOTAL_ORDER;
                break;

            case SchemaType.BTC_DURATION:
            case SchemaType.BTC_DATE_TIME:
            case SchemaType.BTC_TIME:
            case SchemaType.BTC_DATE:
            case SchemaType.BTC_G_YEAR_MONTH:
            case SchemaType.BTC_G_YEAR:
            case SchemaType.BTC_G_MONTH_DAY:
            case SchemaType.BTC_G_DAY:
            case SchemaType.BTC_G_MONTH:
                ordered = SchemaType.PARTIAL_ORDER;
                break;

            case SchemaType.BTC_LONG:
            case SchemaType.BTC_INT:
            case SchemaType.BTC_SHORT:
            case SchemaType.BTC_BYTE:
            case SchemaType.BTC_NON_POSITIVE_INTEGER:
            case SchemaType.BTC_NEGATIVE_INTEGER:
            case SchemaType.BTC_NON_NEGATIVE_INTEGER:
            case SchemaType.BTC_POSITIVE_INTEGER:
            case SchemaType.BTC_UNSIGNED_LONG:
            case SchemaType.BTC_UNSIGNED_INT:
            case SchemaType.BTC_UNSIGNED_SHORT:
            case SchemaType.BTC_UNSIGNED_BYTE:
                isNumeric = true;
                ordered = SchemaType.TOTAL_ORDER;
                isFinite = true;
                isBounded = true;
                break;
        }

        result.setBasicFacets(facets, fixedf);
        result.setWhiteSpaceRule(wsr);
        result.setOrdered(ordered);
        result.setBounded(isBounded);
        result.setNumeric(isNumeric);
        result.setFinite(isFinite);
        result.setDecimalSize(decimalSize);
        result.setAnonymousTypeRefs(EMPTY_SCHEMATYPEREF_ARRAY);

        String pattern = null;
        boolean hasPattern = false;

        switch (btc)
        {
            case SchemaType.BTC_LANGUAGE:
                // we used to have ([a-zA-Z]{2}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*", but s4s uses the more lenient pattern to the left.
                pattern = "[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*";
                hasPattern = true;
                break;
            case SchemaType.BTC_NMTOKEN:
                pattern = "\\c+";
                hasPattern = true;
                break;
            case SchemaType.BTC_NAME:
                pattern = "\\i\\c*";
                hasPattern = true;
                break;
            case SchemaType.BTC_NCNAME:
                pattern = "[\\i-[:]][\\c-[:]]*";
                hasPattern = true;
                break;

            // These types inherit their patterns
            case SchemaType.BTC_ID:
            case SchemaType.BTC_IDREF:
            case SchemaType.BTC_ENTITY:
                hasPattern = true;
                break;
        }

        if (pattern != null)
        {
            RegularExpression p = null;
            try { p = SchemaRegularExpression.forPattern(pattern); }
            catch (ParseException e) { assert false; }
            result.setPatterns(new RegularExpression[] {p});
        }
        result.setPatternFacet(hasPattern);



        // ANY_TYPE has to be able to act like a complex type
        if (btc == SchemaType.BTC_ANY_TYPE)
        {
            SchemaParticleImpl contentModel = new SchemaParticleImpl();
            contentModel.setParticleType(SchemaParticle.WILDCARD);
            contentModel.setWildcardSet(QNameSet.ALL);
            contentModel.setWildcardProcess(SchemaParticle.LAX);
            contentModel.setMinOccurs(BigInteger.ZERO);
            contentModel.setMaxOccurs(null);
            contentModel.setTransitionRules(QNameSet.ALL, true);
            contentModel.setTransitionNotes(QNameSet.ALL, true);

            SchemaAttributeModelImpl attrModel = new SchemaAttributeModelImpl();
            attrModel.setWildcardProcess(SchemaAttributeModel.LAX);
            attrModel.setWildcardSet(QNameSet.ALL);

            result.setComplexTypeVariety(SchemaType.MIXED_CONTENT);
            result.setContentModel(contentModel, attrModel, Collections.EMPTY_MAP, Collections.EMPTY_MAP, false);
            result.setAnonymousTypeRefs(EMPTY_SCHEMATYPEREF_ARRAY);
            result.setWildcardSummary(QNameSet.ALL, true, QNameSet.ALL, true);
        }
        else if (btc == SchemaType.BTC_NOT_BUILTIN)
        {
            // so does the no_type : it permits no contents (and even empty contents is invalid, but that's special-cased)
            SchemaParticleImpl contentModel = null; // empty
            SchemaAttributeModelImpl attrModel = new SchemaAttributeModelImpl(); // empty
            result.setComplexTypeVariety(SchemaType.EMPTY_CONTENT);
            result.setContentModel(contentModel, attrModel, Collections.EMPTY_MAP, Collections.EMPTY_MAP, false);
            result.setAnonymousTypeRefs(EMPTY_SCHEMATYPEREF_ARRAY);
            result.setWildcardSummary(QNameSet.EMPTY, false, QNameSet.EMPTY, false);
        }

        result.setOrderSensitive(false);
    }

    public static SchemaType getNoType()
    {
        return ST_NO_TYPE;
    }
}
