package com.sparta.sortmanager.testing;

import com.model.RandomArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomArrayTest {

    @Test
    public void randomArray_ReturnsArray() {
        RandomArray randomArray = new RandomArray();
        int[] tempArr = randomArray.randomArray(10);

        assertEquals(tempArr.length, 10);

        for (int i = 0; i < tempArr.length; i++) {
            assertNotNull(tempArr[i]);
        }
    }
}
