package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXSerializable;

public class SZStrokeRate implements TCXSerializable {

    private int strokesPerMinute;

    public static SZStrokeRate strokeRate(int strokesPerMinute) {
        return new SZStrokeRate(strokesPerMinute);
    }

    public SZStrokeRate(int strokesPerMinute) {
        this.strokesPerMinute = strokesPerMinute;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<StrokeRate>" + strokesPerMinute + "</StrokeRate>");
    }
}
