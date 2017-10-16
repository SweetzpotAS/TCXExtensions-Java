package com.sweetzpot.tcxextensions.builders;

import com.sweetzpot.tcxextensions.SZRowingActivity;
import com.sweetzpot.tcxextensions.SZSpeed;
import com.sweetzpot.tcxextensions.SZStrokeRate;
import com.sweetzpot.tcxzpot.HeartRate;

public class SZRowingActivityBuilder {

    private HeartRate heartRate;
    private SZSpeed speed;
    private SZStrokeRate strokeRate;

    public static SZRowingActivityBuilder rowing() {
        return new SZRowingActivityBuilder();
    }

    public SZRowingActivityBuilder() {}

    public SZRowingActivityBuilder withAverageHeartRate(HeartRate heartRate) {
        this.heartRate = heartRate;
        return this;
    }

    public SZRowingActivityBuilder withAverageSpeed(SZSpeed speed) {
        this.speed = speed;
        return this;
    }

    public SZRowingActivityBuilder withAverageStrokeRate(SZStrokeRate strokeRate) {
        this.strokeRate = strokeRate;
        return this;
    }

    public SZRowingActivity build() {
        return new SZRowingActivity(heartRate, speed, strokeRate);
    }
}
