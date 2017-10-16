package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.SZSpeed.metersPerSecond;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZSpeedTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);

        metersPerSecond(27.3).serialize(serializer);

        verify(serializer).print("<Speed>27.3</Speed>");
    }
}