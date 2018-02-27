package com.sweetzpot.tcxextensions;


import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXSerializable;

public class SZStrokeNumber implements TCXSerializable {

    private int number;

    public static SZStrokeNumber strokeNumber(int number){ return new SZStrokeNumber(number); }

    public SZStrokeNumber(int number){ this.number = number; }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<StrokeNumber>" + number + "</StrokeNumber>");
    }
}
