package com.sparta.sortmanager.testing;

import com.model.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    public void sort_Quick_ReturnsSortedArray() {
        MergeSort mergeSort = new MergeSort();
        int[] array = {1,3,2,0,100};
        mergeSort.sort(array);
        int[] expectedArray = {0,1,2,3,100};
        assertArrayEquals(expectedArray,array);
    }
}
