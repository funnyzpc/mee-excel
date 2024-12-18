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
package poi.org.apache.xmlbeans.impl.common;

import poi.org.apache.xmlbeans.SchemaTypeLoader;
import poi.org.apache.xmlbeans.SystemProperties;

import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;

/**
 * This class encapsulates the caching strategy for XmlBeans.
 * By subclassing this, a client of XmlBeans can implement caches that are
 * more suitable for different applications using information that XmlBeans
 * cannot know.
 * <p>
 * This class works as a singleton and as a default implementation for the cache.
 * You can set a particular implementation using the "xmlbean.systemcacheimpl"
 * system property or using the static {@link #set(SystemCache)} method.
 * Subclasses of this need to be thread-safe. An implementation can be replaced
 * at any time, so use of static variables is discouraged to ensure proper cleanup.
 */
public class SystemCache {
    private static SystemCache INSTANCE = initCache();

    public static synchronized void set(SystemCache instance) {
        INSTANCE = instance;
    }

    public static synchronized SystemCache get() {
        return INSTANCE;
    }

    public SchemaTypeLoader getFromTypeLoaderCache(ClassLoader cl) {
        return null;
    }

    public void addToTypeLoaderCache(SchemaTypeLoader stl, ClassLoader cl) {
    }

    private ThreadLocal<SoftReference> tl_saxLoaders = new ThreadLocal<>();


    public void clearThreadLocals() {
        tl_saxLoaders.remove();
    }

    public Object getSaxLoader() {
        SoftReference s = tl_saxLoaders.get();
        return s == null ? null : s.get();
    }

    public void setSaxLoader(Object saxLoader) {
        tl_saxLoaders.set(new SoftReference(saxLoader));
    }


    private static SystemCache initCache() {
        String cacheClass = SystemProperties.getProperty("xmlbean.systemcacheimpl");
        if (cacheClass == null) {
            return new SystemCache();
        }
        String errPrefix = "Could not instantiate class " + cacheClass + " as specified by \"xmlbean.systemcacheimpl\". ";
        try {
            return (SystemCache) Class.forName(cacheClass).getDeclaredConstructor().newInstance();
        } catch (ClassCastException cce) {
            throw new ClassCastException(errPrefix + "Class does not derive from SystemCache.");
        } catch (ClassNotFoundException cnfe) {
            throw new RuntimeException(errPrefix + "Class was not found.", cnfe);
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException ie) {
            throw new RuntimeException(errPrefix + "An empty constructor may be missing.", ie);
        } catch (IllegalAccessException iae) {
            throw new RuntimeException(errPrefix + "A public empty constructor may be missing.", iae);
        }
    }
}
