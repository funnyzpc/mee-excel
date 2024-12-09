/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hssf.record;

import java.io.IOException;

import org.apache.commons.io.input.UnsynchronizedByteArrayInputStream;
import org.apache.poi.common.Duplicatable;
import org.apache.poi.common.usermodel.GenericRecord;
import org.apache.poi.util.GenericRecordJsonWriter;

/**
 * All HSSF Records inherit from this class.
 */
public abstract class Record extends RecordBase implements Duplicatable, GenericRecord {

    protected Record() {}

    protected Record(Record other) {}

    /**
     * called by the class that is responsible for writing this sucker.
     * Subclasses should implement this so that their data is passed back in a
     * byte array.
     *
     * @return byte array containing instance data
     */
    public final byte[] serialize() {
        byte[] retval = new byte[ getRecordSize() ];

        serialize(0, retval);
        return retval;
    }

    /**
     * get a string representation of the record (for biffview/debugging)
     */
    @Override
    public final String toString() {
        return GenericRecordJsonWriter.marshal(this);
    }

    /**
     * return the non static version of the id for this record.
     *
     * @return he id for this record
     */
    public abstract short getSid();

    public abstract Record copy();

    @Override
    public abstract HSSFRecordTypes getGenericRecordType();
}
