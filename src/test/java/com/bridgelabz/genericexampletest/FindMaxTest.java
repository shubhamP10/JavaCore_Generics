package com.bridgelabz.genericexampletest;

import com.bridgelabz.genericexample.FindMax;
import com.bridgelabz.genericexample.exceptions.FindMaxException;
import org.junit.Assert;
import org.junit.Test;

/*
 * These Test Cases will Test for FindMax class
 * To check Whether it is working Fine/Not and returning correct values
 * These Test Cases are providing 3 parameters to the method to find largest of 3 numbers
 */
public class FindMaxTest {

    /* Test Cases For Integer Array */
    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(200,150,100).findMaxValue();
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(100,150,50).findMaxValue();
        Assert.assertEquals((Integer) 150, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(100,500,1000).findMaxValue();
        Assert.assertEquals((Integer) 1000, max);
    }

    @Test
    public void givenForthIntegerNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(100,500,1000,5000).findMaxValue();
        Assert.assertEquals((Integer) 5000, max);
    }

    /* Test Cases For Float Array */
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(200f,100f,150f).findMaxValue();
        Assert.assertEquals((Float) 200f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(100f,150f,50f).findMaxValue();
        Assert.assertEquals((Float) 150f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(100f,500f,1000f).findMaxValue();
        Assert.assertEquals((Float) 1000f, max);
    }

    @Test
    public void givenForthFloatNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(100f,500f,1000f,5000f).findMaxValue();
        Assert.assertEquals((Float) 5000f, max);
    }

    /* Test Cases For String Array */
    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() throws FindMaxException {
        String max = new FindMax<>("Morning", "Hello", "GM").findMaxValue();
        Assert.assertEquals("Morning", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_ThirdStringAsMax() throws FindMaxException {
        String max = new FindMax<>("Good", "Morning", "All").findMaxValue();
        Assert.assertEquals("Morning", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() throws FindMaxException {
        String max = new FindMax<>("All", "Good", "Morning").findMaxValue();
        Assert.assertEquals("Morning", max);
    }
    @Test
    public void givenForthStringAsLarge_ShouldReturn_ForthStringAsMax() throws FindMaxException {
        String max = new FindMax<>("All", "Good", "Morning","You").findMaxValue();
        Assert.assertEquals("You", max);
    }

    @Test
    public void givenEmpty_ShouldReturn_AnException() {
        try{
            new FindMax<>().findMaxValue();
        }catch (FindMaxException e){
            Assert.assertEquals("No Elements to Compare",e.getMessage());
        }
    }
}
