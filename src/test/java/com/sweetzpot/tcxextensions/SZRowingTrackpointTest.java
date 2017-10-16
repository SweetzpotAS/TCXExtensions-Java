package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.builders.SZRowingTrackpointBuilder.rowing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZRowingTrackpointTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);
        SZAcceleration acceleration = mock(SZAcceleration.class);
        SZSpeed speed = mock(SZSpeed.class);
        SZStrokeRate strokeRate = mock(SZStrokeRate.class);
        SZRawForce rawForce = mock(SZRawForce.class);

        rowing().withAcceleration(acceleration)
                .withSpeed(speed)
                .withStrokeRate(strokeRate)
                .withRawForce(rawForce)
                .build()
                .serialize(serializer);

        verify(serializer).print("<SZRowing xmlns=\"https://www.sweetzpot.com/xmlschemas/RowingExtension/v1\">");
        verify(acceleration).serialize(serializer);
        verify(speed).serialize(serializer);
        verify(strokeRate).serialize(serializer);
        verify(rawForce).serialize(serializer);
        verify(serializer).print("</SZRowing>");
    }
}