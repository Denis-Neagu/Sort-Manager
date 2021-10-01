package com.model;

public class MergeSort implements Sort {
    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length-1);
    }

    private void sort(int[] array, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            sort(array, start, mid);
            sort(array, mid + 1, end);
        }

        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end) {
            tmp[i++] = array[first] < array[last] ? array[first++] : array[last++];
        }
        while (first <= mid) {
            tmp[i++] = array[first++];
        }
        while (last <= end) {
            tmp[i++] = array[last++];
        }
        i = 0;
        while (start <= end) {
            array[start++] = tmp[i++];
        }
    }
}
