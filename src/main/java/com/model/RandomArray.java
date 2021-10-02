package com.model;

import java.util.Random;

public class RandomArray implements RandomArrayInterface{
    @Override
    public int[] randomArray(int arraySize) {
        Random rand = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
}
