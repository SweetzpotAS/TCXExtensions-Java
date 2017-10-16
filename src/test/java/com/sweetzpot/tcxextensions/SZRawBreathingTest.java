package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.SZRawBreathing.rawBreathing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZRawBreathingTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);

        rawBreathing(391).serialize(serializer);

        verify(serializer).print("<RawBreathing>391</RawBreathing>");
    }
}