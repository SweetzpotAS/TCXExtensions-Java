package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXSerializable;

public class SZRawForce implements TCXSerializable {

    private int value;

    public static SZRawForce rawForce(int value) {
        return new SZRawForce(value);
    }

    public SZRawForce(int value) {
        this.value = value;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<RawForce>" + value + "</RawForce>");
    }
}
