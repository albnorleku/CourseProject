package com.roiacademy.unitTesting;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void splitAndCalculateCorrect() throws Exception {
        String stringToTest = "20/5";
        Assert.assertNotNull(String.valueOf(Calculator.splitAndCalculate(stringToTest)));
        Assert.assertEquals("4.0", String.valueOf(Calculator.splitAndCalculate(stringToTest)));
    }

    @Ignore
    @Test
    public void splitAndCalculateInfinity() throws Exception {
        String stringToTest = "20/0";
        Assert.assertEquals("Infinity", String.valueOf(Calculator.splitAndCalculate(stringToTest)));
    }

    @Test(expected = Exception.class)
    public void should_throw_exception_splitAndCalculate() throws Exception {
        String stringToTest = "200123";
        Calculator.splitAndCalculate(stringToTest);
    }
}
