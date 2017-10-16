package com.sweetzpot.tcxextensions;


import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.SZAcceleration.acceleration;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZAccelerationTest {

    @Test
    public void serializesAccelerationToXML() throws Exception {
        Serializer serializer = mock(Serializer.class);

        acceleration(1.0, 2.1, 3.2).serialize(serializer);

        verify(serializer).print("<Acceleration>");
        verify(serializer).print("<X>1.0</X>");
        verify(serializer).print("<Y>2.1</Y>");
        verify(serializer).print("<Z>3.2</Z>");
        verify(serializer).print("</Acceleration>");
    }
}