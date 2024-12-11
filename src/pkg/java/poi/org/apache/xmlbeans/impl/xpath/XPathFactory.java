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

package poi.org.apache.xmlbeans.impl.xpath;

import poi.org.apache.xmlbeans.XmlOptions;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class XPathFactory {
    private static final int USE_XMLBEANS = 0x01;
    private static final int USE_SAXON = 0x04;

//    private static final Map<String, WeakReference<Path>> _xmlbeansPathCache = new WeakHashMap<>();
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    static String getCurrentNodeVar(XmlOptions options) {
        String currentNodeVar = "this";

        options = XmlOptions.maskNull(options);

        String cnv = options.getXqueryCurrentNodeVar();
        if (cnv != null) {
            currentNodeVar = cnv;

            if (currentNodeVar.startsWith("$")) {
                throw new IllegalArgumentException("Omit the '$' prefix for the current node variable");
            }
        }

        return currentNodeVar;
    }


    //
    // Xqrl store specific implementation of compiled path/query
    //

}
