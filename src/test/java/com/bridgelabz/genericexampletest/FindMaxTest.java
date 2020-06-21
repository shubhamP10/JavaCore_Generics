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
        Integer[] integerValues = {200, 15, 100};
        Integer max = new FindMax<>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Integer[] integerValues = {20, 150, 100};
        Integer max = new FindMax<>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 150, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Integer[] integerValues = {200, 15, 1000};
        Integer max = new FindMax<>(integerValues).findMaxValue();
        Assert.assertEquals((Integer) 1000, max);
    }

    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Float[] floatValues = {200f, 15f, 100f};
        Float max = new FindMax<>(floatValues).findMaxValue();
        Assert.assertEquals((Float) 200f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Float[] floatValues = {20f, 150f, 100f};
        Float max = new FindMax<>(floatValues).findMaxValue();
        Assert.assertEquals((Float) 150f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Float[] floatValues = {200f, 15f, 1000f};
        Float max = new FindMax<>(floatValues).findMaxValue();
        Assert.assertEquals((Float) 1000f, max);
    }

    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() {
        String[] stringValues = {"Morning", "Hello", "GM"};
        String max = new FindMax<>(stringValues).findMaxValue();
        Assert.assertEquals("Morning", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String[] stringValues = {"Good", "Morning", "All"};
        String max = new FindMax<>(stringValues).findMaxValue();
        Assert.assertEquals("Morning", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String[] stringValues = {"All", "Good", "Morning"};
        String max = new FindMax<>(stringValues).findMaxValue();
        Assert.assertEquals("Morning", max);
    }
}
