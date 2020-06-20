package com.bridgelabz.genericsexample;

public class PrintArray {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        Double[] doubleArray = {1.1,2.2,3.3};
        Character[] charArray = {'a','b','c'};
        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(charArray);

    }

    private static <E> void toPrint(E[] arrayValue) {
        for (E i:arrayValue) {
            System.out.println(i);
        }
    }
}
