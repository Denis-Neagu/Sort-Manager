package com.controller;

import com.model.BubbleSort;
import com.model.MergeSort;
import com.model.QuickSort;

public class ObjectFactory {
    public Object getInstance(String key) {
        if (key.equals("B")) {
            return new BubbleSort();
        } else if (key.equals("M")) {
            return new MergeSort();
        } else if (key.equals("Q")) {
            return new QuickSort();
        } else {
            return null;
        }
    }
}
