package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXSerializable;

public class SZAcceleration implements TCXSerializable {

    private final double x;
    private final double y;
    private final double z;

    public static SZAcceleration acceleration(double x, double y, double z) {
        return new SZAcceleration(x, y, z);
    }

    public SZAcceleration(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<Acceleration>");
        serializer.print("<X>" + x + "</X>");
        serializer.print("<Y>" + y + "</Y>");
        serializer.print("<Z>" + z + "</Z>");
        serializer.print("</Acceleration>");
    }
}
