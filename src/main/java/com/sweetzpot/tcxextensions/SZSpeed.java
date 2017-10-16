package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXSerializable;

public class SZSpeed implements TCXSerializable {

    private double metersPerSecond;

    public static SZSpeed metersPerSecond(double metersPerSecond) {
        return new SZSpeed(metersPerSecond);
    }

    public SZSpeed(double metersPerSecond) {
        this.metersPerSecond = metersPerSecond;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<Speed>" + metersPerSecond + "</Speed>");
    }
}
