package com.sparta.sortmanager.testing;


import com.model.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void sort_Merge_ReturnsSortedArray() {
        MergeSort mergeSort = new MergeSort();
        int[] array = {1,5,3,9,15,6,6};
        mergeSort.sort(array);
        int[] expectedArray = {1,3,5,6,6,9,15};
        assertArrayEquals(expectedArray,array);
    }
}
