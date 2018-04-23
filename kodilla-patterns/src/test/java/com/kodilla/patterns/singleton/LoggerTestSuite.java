package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog(){
        //Given
        Logger.getInstance().log("First Log");

        //When
        Logger.getInstance().log("Second Log");

        //Then
        Assert.assertEquals("Second Log", Logger.getInstance().getLastLog());
    }
}
