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

package poi.org.apache.xmlbeans;

import java.util.Map;
import java.util.Properties;


public class SystemProperties {

    private static Map<Object, Object> propertyH;

    public static String getProperty(String key) {
        if (propertyH == null) {
            try {
                propertyH = System.getProperties();
            } catch (SecurityException ex) {
                propertyH = new Properties();
                return null;
            }
        }
        Object ret = propertyH.get(key);
        return ret == null ? null : ret.toString();
    }

    public static String getProperty(String key, String defaultValue) {
        String result = getProperty(key);
        if (result == null) {
            return defaultValue;
        }
        return result;
    }

    public static void setPropertyH(Map<Object, Object> aPropertyH) {
        propertyH = aPropertyH;
    }

}

