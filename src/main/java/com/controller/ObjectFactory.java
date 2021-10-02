package com.controller;

import com.model.*;

public class ObjectFactory {
    public static Sort getInstance(String key) {
        if (key.equalsIgnoreCase("B")) {
            return new BubbleSort();
        } else if (key.equalsIgnoreCase("M")) {
            return new MergeSort();
        } else if (key.equalsIgnoreCase("Q")) {
            return new QuickSort();
        }  else if (key.equalsIgnoreCase("S")) {
            return new SelectionSort();
        } else {
            return null;
        }
    }
}
