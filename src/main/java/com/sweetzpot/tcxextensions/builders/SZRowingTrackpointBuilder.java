package com.sweetzpot.tcxextensions.builders;

import com.sweetzpot.tcxextensions.*;

public class SZRowingTrackpointBuilder {

    private SZAcceleration acceleration;
    private SZSpeed speed;
    private SZRawForce rawForce;
    private SZStrokeRate strokeRate;

    public static SZRowingTrackpointBuilder rowing() {
        return new SZRowingTrackpointBuilder();
    }

    public SZRowingTrackpointBuilder() {}

    public SZRowingTrackpointBuilder withAcceleration(SZAcceleration acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public SZRowingTrackpointBuilder withSpeed(SZSpeed speed) {
        this.speed = speed;
        return this;
    }

    public SZRowingTrackpointBuilder withRawForce(SZRawForce rawForce) {
        this.rawForce = rawForce;
        return this;
    }

    public SZRowingTrackpointBuilder withStrokeRate(SZStrokeRate strokeRate) {
        this.strokeRate = strokeRate;
        return this;
    }

    public SZRowingTrackpoint build() {
        return new SZRowingTrackpoint(acceleration, speed, strokeRate, rawForce);
    }
}
