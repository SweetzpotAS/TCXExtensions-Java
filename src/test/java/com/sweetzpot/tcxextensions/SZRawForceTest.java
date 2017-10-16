package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.SZRawForce.rawForce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZRawForceTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);

        rawForce(1958).serialize(serializer);

        verify(serializer).print("<RawForce>1958</RawForce>");
    }
}