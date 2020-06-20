package com.bridgelabz.genericexample;

public class FindMax <E extends Comparable> {
    E[] values;

    public FindMax(E[] values) {
        this.values = values;
    }

    public <E extends Comparable> E findMaxValue() {
        E max = (E) values[0];
        if (values[1].compareTo(max) > 0) {
            max = (E) values[1];
        }
        if (values[2].compareTo(max) > 0) {
            max = (E) values[2];
        }
        printMax(max);
        return max;
    }

    /*
    * Generic Method to Find the Max Value of passed Arguments
    **/
    public static <E> void printMax(E max){
        System.out.println("Max Value = "+max);
    }

    public static void main(String[] args) {
        Integer[] values = {10,20,30};
        String[] values2 = {"200","15","1000"};
        new FindMax<String>(values2).findMaxValue();
        new FindMax<Integer>(values).findMaxValue();
    }
}
