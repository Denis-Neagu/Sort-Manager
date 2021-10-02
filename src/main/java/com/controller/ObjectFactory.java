package com.controller;

import com.model.BubbleSort;
import com.model.MergeSort;
import com.model.QuickSort;
import com.model.SelectionSort;

public class ObjectFactory {
    public static Object getInstance(String key) {
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
