package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXExtension;

public class SZRowingTrackpoint implements TCXExtension {

    private final SZAcceleration acceleration;
    private final SZSpeed speed;
    private final SZStrokeRate strokeRate;
    private final SZRawForce rawForce;
    private SZStrokeNumber strokeNumber;

    public SZRowingTrackpoint(SZAcceleration acceleration, SZSpeed speed, SZStrokeRate strokeRate, SZRawForce rawForce, SZStrokeNumber strokeNumber) {
        this.acceleration = acceleration;
        this.speed = speed;
        this.strokeRate = strokeRate;
        this.rawForce = rawForce;
        this.strokeNumber = strokeNumber;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<SZRowing xmlns=\"https://www.sweetzpot.com/xmlschemas/RowingExtension/v1\">");
        if(acceleration != null) acceleration.serialize(serializer);
        if(speed != null) speed.serialize(serializer);
        if(strokeRate != null) strokeRate.serialize(serializer);
        if(rawForce != null) rawForce.serialize(serializer);
        if(strokeNumber != null) strokeNumber.serialize(serializer);
        serializer.print("</SZRowing>");
    }
}
