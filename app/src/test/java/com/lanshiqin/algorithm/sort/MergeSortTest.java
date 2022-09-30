package com.lanshiqin.algorithm.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void mergeSort() {
        int[] nums = {11, 8, 3, 9, 7, 1, 2, 5};
        int[] expected = {1, 2, 3, 5, 7, 8, 9, 11};
        new MergeSort().mergeSort(nums);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}