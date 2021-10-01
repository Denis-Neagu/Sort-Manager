package com.model;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] array) {
        if(array == null || array.length == 0) {
            System.out.println("array is null or empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                for(int j = i + 1; j < array.length; j++) {
                    if(array[i] > array[j]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
    }
}
