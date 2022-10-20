package com.lanshiqin.algorithm.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingSortTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void countSort() {
        int[] nums = {2, 5, 3, 0, 2, 3, 0, 3};
        new CountingSort().countSort(nums);
        int[] expectedResult = {0, 0, 2, 2, 3, 3, 3, 5};
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], nums[i]);
        }
    }
}