package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.builders.SZBreathingTrackpointBuilder.breathing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZBreathingTrackpointTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);
        SZRawBreathing rawBreathing = mock(SZRawBreathing.class);

        breathing().withRawBreathing(rawBreathing)
                .build()
                .serialize(serializer);

        verify(serializer).print("<SZBreathing xmlns=\"https://www.sweetzpot.com/xmlschemas/BreathingExtension/v1\">");
        verify(rawBreathing).serialize(serializer);
        verify(serializer).print("</SZBreathing>");
    }

    @Test
    public void serializesToTCXWithMissingArguments() throws Exception {
        Serializer serializer = mock(Serializer.class);

        breathing().build()
                .serialize(serializer);

        verify(serializer).print("<SZBreathing xmlns=\"https://www.sweetzpot.com/xmlschemas/BreathingExtension/v1\">");
        verify(serializer).print("</SZBreathing>");
    }
}