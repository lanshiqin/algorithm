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
        int[] nums = {3, 2, 1, 5, 6, 4};
        new MergeSort().mergeSort(nums);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(i + 1, nums[i]);
        }
    }
}