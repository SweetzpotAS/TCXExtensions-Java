package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.Serializer;

import org.junit.Test;

import static com.sweetzpot.tcxextensions.SZStrokeNumber.strokeNumber;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZStrokeNumberTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);

        strokeNumber(3).serialize(serializer);

        verify(serializer).print("<StrokeNumber>3</StrokeNumber>");
    }
}