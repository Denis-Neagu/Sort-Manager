package com.sparta.sortmanager.testing;

import com.model.BubbleSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    BubbleSort bubbleSort;

    @BeforeEach
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sort_Bubble_ReturnsSortedArray() {
        int[] array = {1,5,3,9};
        bubbleSort.sort(array);
        int[] expectedArray = {1,3,5,9};
        assertArrayEquals(expectedArray,array);
    }

    @Test
    public void sort_Bubble_NullArray() {
        int[] array = null;
        bubbleSort.sort(array);
    }
}
