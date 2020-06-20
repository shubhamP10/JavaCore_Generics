package com.bridgelabz.genericexample;

public class FindMax <E extends Comparable<E> > {
    E[] values;

    public FindMax(E[] values) {
        this.values = values;
    }

    public <T extends Comparable<E>> E findMaxValue() {
        if (values[0].compareTo(values[1]) > 0) {
            if (values[0].compareTo(values[2]) > 0) {
                printMax(values[0]);
                return values[0];
            }
            else {
                printMax(values[2]);
                return values[2];
            }
        }
        else {
            if (values[1].compareTo(values[2]) > 0) {
                printMax(values[1]);
                return values[1];
            }
            else {
                printMax(values[2]);
                return values[2];
            }
        }
    }

    /*
    * Generic Method to Find the Max Value of passed Arguments
    **/
    public static <E> void printMax(E max){
        System.out.println("Max Value = "+max);
    }

    public static void main(String[] args) {
        Integer[] values = {10,20,30};
        String[] values2 = {"200","1500","1000"};
        new FindMax<String>(values2).findMaxValue();
        new FindMax<Integer>(values).findMaxValue();
    }
}
