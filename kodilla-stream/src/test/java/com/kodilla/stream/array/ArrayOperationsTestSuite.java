package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] intNumbers = new int[20];
        for (int i = 0; i < intNumbers.length; i++) {
            intNumbers[i] = 20;
        }
        ArrayNumbers arrayNumbers = new ArrayNumbers();

        //When
        double average = arrayNumbers.getAverage( intNumbers );

        //Then
        Assert.assertEquals( 20.0, average, 0.001 );
    }
}
