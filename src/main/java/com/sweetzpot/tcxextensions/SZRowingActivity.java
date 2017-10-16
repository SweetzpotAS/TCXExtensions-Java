package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.HeartRate;
import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXExtension;

public class SZRowingActivity implements TCXExtension {

    private final HeartRate heartRate;
    private final SZSpeed speed;
    private final SZStrokeRate strokeRate;

    public SZRowingActivity(HeartRate heartRate, SZSpeed speed, SZStrokeRate strokeRate) {
        this.heartRate = heartRate;
        this.speed = speed;
        this.strokeRate = strokeRate;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<SZRowing xmlns=\"https://www.sweetzpot.com/xmlschemas/RowingExtension/v1\">");
        if(heartRate != null) {
            serializer.print("<HeartRate>");
            heartRate.serialize(serializer);
            serializer.print("</HeartRate>");
        }
        if(speed != null) speed.serialize(serializer);
        if(strokeRate != null) strokeRate.serialize(serializer);
        serializer.print("</SZRowing>");
    }
}
