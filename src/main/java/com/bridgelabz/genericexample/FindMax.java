package com.bridgelabz.genericexample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Generic Class To Find Max Values
 */
public class FindMax<E extends Comparable<E>> {
    //Array of Generic values
    E[] values;
    //List of Generic Values
    List<E> listValues = new LinkedList<>();

    //Constructor to Initialize Generic Array
    public FindMax(E[] values) {
        this.values = values;
    }

    //Constructor to Initialize Generic List
    public FindMax(List<E> listValues) {
        this.listValues = listValues;
    }

    //Method to Find  Max Value From List
    public E findMax() {
        E max = Collections.max(listValues);
        printMax(max);
        return max;
    }

    //Method to Find Max Value Form Array
    public E findMaxValue() {
        if (values[0].compareTo(values[1]) > 0 && values[0].compareTo(values[2]) > 0) {
            printMax(values[0]);
            return values[0];
        } else if (values[1].compareTo(values[0]) > 0 && values[1].compareTo(values[2]) > 0) {
            printMax(values[1]);
            return values[1];
        } else {
            printMax(values[2]);
            return values[2];
        }
    }

    /*
     *Method to print Max Value
     * @param is Generic Value
     */
    private void printMax(E value) {
        System.out.println("Max Value = " + value);
    }

}
