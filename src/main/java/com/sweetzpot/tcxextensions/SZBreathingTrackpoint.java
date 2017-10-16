package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import com.sweetzpot.tcxzpot.TCXExtension;

public class SZBreathingTrackpoint implements TCXExtension {

    private SZRawBreathing rawBreathing;

    public SZBreathingTrackpoint(SZRawBreathing rawBreathing) {
        this.rawBreathing = rawBreathing;
    }

    @Override
    public void serialize(Serializer serializer) {
        serializer.print("<SZBreathing xmlns=\"https://www.sweetzpot.com/xmlschemas/BreathingExtension/v1\">");
        if(rawBreathing != null) rawBreathing.serialize(serializer);
        serializer.print("</SZBreathing>");
    }
}
