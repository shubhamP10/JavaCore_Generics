package com.bridgelabz.genericexample;

import com.bridgelabz.genericexample.exceptions.FindMaxException;

import java.util.Arrays;

/*
 * Generic Class To Find Max Values
 */
public class FindMax<E extends Comparable<E>> {
    E[] values;

    @SafeVarargs
    public FindMax(E... values) {
        this.values = values;
    }

    public E findMaxValue() throws FindMaxException {
        if (values.length == 0) {
            throw new FindMaxException("No Elements to Compare");
        } else {
            Arrays.sort(values);
            printMax(values[values.length - 1]);
            return values[values.length - 1];
        }
    }

    /*
     *Method to print Max Value
     * @param is Generic Value
     */
    public void printMax(E value) {
        System.out.println("Max Value = " + value);
    }
}
