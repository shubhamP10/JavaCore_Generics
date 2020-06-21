package com.bridgelabz.genericexample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class FindMax<E extends Comparable<E>> {
    E[] values;
    List<E> listValues = new LinkedList<>();

    public FindMax(E[] values) {
        this.values = values;
    }

    public FindMax(List<E> listValues) {
        this.listValues = listValues;
    }

    public <E> E findMax() {
        return (E) Collections.max(listValues);
    }

    public E findMaxValue() {
        if (values[0].compareTo(values[1]) > 0 && values[0].compareTo(values[2]) > 0) {
            return values[0];
        } else if (values[1].compareTo(values[0]) > 0 && values[1].compareTo(values[2]) > 0) {
            return values[1];
        } else {
            return values[2];
        }
    }

}
