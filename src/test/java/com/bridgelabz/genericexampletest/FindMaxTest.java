package com.bridgelabz.genericexampletest;

import com.bridgelabz.genericexample.FindMax;
import org.junit.Assert;
import org.junit.Test;
/*
* These Test Cases will Test for FindMax class
* To check Whether it is working Fine/Not and returning correct values
* These Test Cases are providing 3 parameters to the method to find largest of 3 numbers
*/
public class FindMaxTest {
    private FindMax findMax;

    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer[] integerValues = {200,15,100};
        Integer max = new FindMax<Integer>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 200,max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Integer[] integerValues = {20,150,100};
        Integer max = new FindMax<Integer>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 150,max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Integer[] integerValues = {200,15,1000};
        Integer max = new FindMax<Integer>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 1000,max);
    }

    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Float[] floatValues = {200f,15f,100f};
        Float max = new FindMax<Float>(floatValues).findMaxValue();
        Assert.assertEquals((Float) 200f,max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Float[] floatValues = {20f,150f,100f};
        Float max = new FindMax<Float>(floatValues).findMaxValue();
        Assert.assertEquals((Float) 150f,max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Float[] floatValues = {200f,15f,1000f};
        Float max = new FindMax<Float>(floatValues).findMaxValue();
        Assert.assertEquals((Float) 1000f,max);
    }

    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() {
        String[] stringValues = {"200","15","100"};
        String max = new FindMax<String>(stringValues).findMaxValue();
        Assert.assertEquals((String) "200",max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String[] stringValues = {"20","150","100"};
        String max = new FindMax<String>(stringValues).findMaxValue();
        Assert.assertEquals((String) "150",max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String[] stringValues = {"200","15","1000"};
        String max = new FindMax<String>(stringValues).findMaxValue();
        Assert.assertEquals((String) "1000",max);
    }
}
