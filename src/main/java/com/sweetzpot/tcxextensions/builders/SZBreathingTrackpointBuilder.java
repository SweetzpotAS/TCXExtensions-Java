package com.sweetzpot.tcxextensions.builders;

import com.sweetzpot.tcxextensions.SZBreathingTrackpoint;
import com.sweetzpot.tcxextensions.SZRawBreathing;

public class SZBreathingTrackpointBuilder {

    private SZRawBreathing rawBreathing;

    public static SZBreathingTrackpointBuilder breathing() {
        return new SZBreathingTrackpointBuilder();
    }

    public SZBreathingTrackpointBuilder() {}

    public SZBreathingTrackpointBuilder withRawBreathing(SZRawBreathing rawBreathing) {
        this.rawBreathing = rawBreathing;
        return this;
    }

    public SZBreathingTrackpoint build() {
        return new SZBreathingTrackpoint(rawBreathing);
    }
}
