package com.lanshiqin.algorithm.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BucketSortTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void bucketSort() {
        int[] nums = {22, 5, 11, 41, 45, 26, 29, 10, 7, 8, 30, 27, 42, 43, 40};
        new BucketSort().bucketSort(nums);
        int[] expectedNums = {5, 7, 8, 10, 11, 22, 26, 27, 29, 30, 40, 41, 42, 43, 45};
        for (int i = 0; i < nums.length; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
}