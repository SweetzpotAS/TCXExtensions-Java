package com.sweetzpot.tcxextensions;

import com.sweetzpot.tcxzpot.HeartRate;
import com.sweetzpot.tcxzpot.Serializer;
import org.junit.Test;

import static com.sweetzpot.tcxextensions.builders.SZRowingActivityBuilder.rowing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SZRowingActivityTest {

    @Test
    public void serializesToTCXFormat() throws Exception {
        Serializer serializer = mock(Serializer.class);
        HeartRate heartRate = mock(HeartRate.class);
        SZSpeed speed = mock(SZSpeed.class);
        SZStrokeRate strokeRate = mock(SZStrokeRate.class);

        rowing().withAverageHeartRate(heartRate)
                .withAverageSpeed(speed)
                .withAverageStrokeRate(strokeRate)
                .build()
                .serialize(serializer);

        verify(serializer).print("<SZRowing xmlns=\"https://www.sweetzpot.com/xmlschemas/RowingExtension/v1\">");
        verify(serializer).print("<HeartRate>");
        verify(heartRate).serialize(serializer);
        verify(serializer).print("</HeartRate>");
        verify(speed).serialize(serializer);
        verify(strokeRate).serialize(serializer);
        verify(serializer).print("</SZRowing>");
    }

    @Test
    public void serializesToTCXFormatWithMissingArguments() throws Exception {
        Serializer serializer = mock(Serializer.class);

        rowing().build()
                .serialize(serializer);

        verify(serializer).print("<SZRowing xmlns=\"https://www.sweetzpot.com/xmlschemas/RowingExtension/v1\">");
        verify(serializer).print("</SZRowing>");
    }
}