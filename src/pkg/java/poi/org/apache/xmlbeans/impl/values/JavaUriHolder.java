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

package poi.org.apache.xmlbeans.impl.values;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlAnyURI;
import poi.org.apache.xmlbeans.XmlErrorCodes;
import poi.org.apache.xmlbeans.impl.common.ValidationContext;

import poi.org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;

public abstract class JavaUriHolder extends XmlObjectBase
{
    public JavaUriHolder() {}

    public SchemaType schemaType()
        { return BuiltinSchemaTypeSystem.ST_ANY_URI; }

    private String _value;

    public String compute_text(NamespaceManager nsm) { return _value == null ? "" : _value; }
    protected void set_text(String s)
    {
        if (_validateOnSet())
            validateLexical(s, _voorVc);
        _value = s;
    }

    public static void validateLexical(String v, ValidationContext context)
    {
        // Enough validation to get schema for schema working

        if (v.startsWith( "##" ))
            context.invalid(XmlErrorCodes.ANYURI, new Object[] { v });

    }
    
    protected void set_nil() { _value = null; }

    // string setter and getter already handled by XmlObjectBase

    // comparators
    protected boolean equal_to(XmlObject obj)
    {
        return _value.equals(((XmlAnyURI)obj).getStringValue());
    }

    protected int value_hash_code()
    {
        return _value.hashCode();
    }
}
