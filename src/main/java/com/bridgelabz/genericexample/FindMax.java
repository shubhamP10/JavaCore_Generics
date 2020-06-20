package com.bridgelabz.genericexample;

public class FindMax {

    public Integer findMaxValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }
    public Float findMaxValue(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }

    public String findMaxValue(String firstNumber, String secondNumber, String thirdNumber) {
        String max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }

    private void printMax(Integer max) {
        System.out.println("Largest = " + max);
    }

    private void printMax(Float max) {
        System.out.println("Largest = " + max);
    }

    private void printMax(String max) {
        System.out.println("Largest = " + max);
    }
}
