package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXExtension;

public class SZRowingTrackpoint implements TCXExtension {

    private final SZAcceleration acceleration;
    private final SZSpeed speed;
    private final SZStrokeRate strokeRate;
    private final SZRawForce rawForce;

    public SZRowingTrackpoint(SZAcceleration acceleration, SZSpeed speed, SZStrokeRate strokeRate, SZRawForce rawForce) {
        this.acceleration = acceleration;
        this.speed = speed;
        this.strokeRate = strokeRate;
        this.rawForce = rawForce;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<SZRowing xmlns=\"https://www.sweetzpot.com/xmlschema/RowingExtension/v1\">");
        if(acceleration != null) acceleration.serialize(serializer);
        if(speed != null) speed.serialize(serializer);
        if(strokeRate != null) strokeRate.serialize(serializer);
        if(rawForce != null) rawForce.serialize(serializer);
        serializer.print("</SZRowing>");
    }
}
