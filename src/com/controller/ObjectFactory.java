package com.controller;

import com.model.BubbleSort;
import com.model.MergeSort;
import com.model.QuickSort;

public class ObjectFactory {
    public Object getInstance(String key) {
        if (key.equals("BubbleSort")) {
            return new BubbleSort();
        } else if (key.equals("MergeSort")) {
            return new MergeSort();
        } else if (key.equals("QuickSort")) {
            return new QuickSort();
        } else {
            return null;
        }
    }
}
