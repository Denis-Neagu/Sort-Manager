package com.sparta.sortmanager.testing;

import com.model.BubbleSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void sort_Bubble_ReturnsSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1,5,3,9};
        bubbleSort.sort(array);
        int[] expectedArray = {1,3,5,9};
        assertArrayEquals(expectedArray,array);
    }
}
