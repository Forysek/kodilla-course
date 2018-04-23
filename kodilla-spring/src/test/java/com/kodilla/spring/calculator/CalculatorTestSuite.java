package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(1.10d, 1.10d);
        double sub = calculator.sub(1.10d, 1.10d);
        double mul = calculator.mul(1.20d, 1.20d);
        double div = calculator.div(1.10d, 1.10d);
        //Then
        Assert.assertEquals(2.2d, add, 0.001);
        Assert.assertEquals(0.0d, sub, 0.001);
        Assert.assertEquals(1.44d, mul, 0.001);
        Assert.assertEquals(1.0d, div, 0.001);
    }
}
