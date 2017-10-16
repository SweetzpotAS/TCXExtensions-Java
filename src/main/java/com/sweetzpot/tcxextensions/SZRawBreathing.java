package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXSerializable;

public class SZRawBreathing implements TCXSerializable {

    private int value;

    public static SZRawBreathing rawBreathing(int value) {
        return new SZRawBreathing(value);
    }

    public SZRawBreathing(int value) {
        this.value = value;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<RawBreathing>" + value + "</RawBreathing>");
    }
}
