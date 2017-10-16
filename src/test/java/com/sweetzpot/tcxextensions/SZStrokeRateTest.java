package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.SZStrokeRate.strokeRate;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZStrokeRateTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);

        strokeRate(46).serialize(serializer);

        verify(serializer).print("<StrokeRate>46</StrokeRate>");
    }
}