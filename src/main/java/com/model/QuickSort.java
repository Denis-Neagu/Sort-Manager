package com.model;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    private void quickSort(int[] numbers, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(numbers, left, right);
            quickSort(numbers, left, pivotIndex - 1);
            quickSort(numbers, pivotIndex, right);
        }
    }

    private int partition(int[] numbers, int left, int right) {
        int pivot = numbers[right];
        int i = left - 1;
        for (int j = left; j < right; ++j) {
            if (numbers[j] <= pivot) {
                swap(numbers, ++i, j);
            }
        }
        swap(numbers, ++i, right);
        return i;
    }
    private static void swap(int[] array,int i,int j)
    {
        int temp;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
