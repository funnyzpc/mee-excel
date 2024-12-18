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

import java.util.Map;
import java.util.function.Supplier;

import org.apache.poi.hssf.util.RKUtil;
import org.apache.poi.util.GenericRecordUtil;
import org.apache.poi.util.LittleEndianOutput;

/**
 * An internal 32 bit number with the two most significant bits storing the type.
 * This is part of a bizarre scheme to save disk space and memory (gee look at all the other whole
 * records that are in the file just "cause".., far better to waste processor cycles on this then
 * leave on of those "valuable" records out).
 * We support this in READ-ONLY mode.  HSSF converts these to NUMBER records
 *
 * @see NumberRecord
 */
public final class RKRecord extends CellRecord {
    public static final short sid                      = 0x027E;
    public static final short RK_IEEE_NUMBER           = 0;
    public static final short RK_IEEE_NUMBER_TIMES_100 = 1;
    public static final short RK_INTEGER               = 2;
    public static final short RK_INTEGER_TIMES_100     = 3;

    private final int field_4_rk_number;

    public RKRecord(RKRecord other) {
        super(other);
        field_4_rk_number = other.field_4_rk_number;
    }

    public RKRecord(RecordInputStream in) {
        super(in);
        field_4_rk_number = in.readInt();
    }

    /**
     * Extract the value of the number
     * <P>
     * The mechanism for determining the value is dependent on the two
     * low order bits of the raw number. If bit 1 is set, the number
     * is an integer and can be cast directly as a double, otherwise,
     * it's apparently the exponent and mantissa of a double (and the
     * remaining low-order bits of the double's mantissa are 0's).
     * <P>
     * If bit 0 is set, the result of the conversion to a double is
     * divided by 100; otherwise, the value is left alone.
     * <P>
     * [insert picture of Screwy Squirrel in full Napoleonic regalia]
     *
     * @return the value as a proper double (hey, it <B>could</B>
     *         happen)
     */
    public double getRKNumber() {
        return RKUtil.decodeNumber(field_4_rk_number);
    }

    @Override
    protected String getRecordName() {
        return "RK";
    }

    @Override
    protected void serializeValue(LittleEndianOutput out) {
        out.writeInt(field_4_rk_number);
    }

    @Override
    protected int getValueDataSize() {
        return 4;
    }

    @Override
    public short getSid() {
        return sid;
    }

    @Override
    public RKRecord copy() {
        return new RKRecord(this);
    }

    @Override
    public HSSFRecordTypes getGenericRecordType() {
        return HSSFRecordTypes.RK;
    }

    @Override
    public Map<String, Supplier<?>> getGenericProperties() {
        return GenericRecordUtil.getGenericProperties(
            "base", super::getGenericProperties,
            "rkNumber", this::getRKNumber
        );
    }
}
