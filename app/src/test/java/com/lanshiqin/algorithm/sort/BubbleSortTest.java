package com.lanshiqin.algorithm.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void bubbleSort() {
        int[] nums = {3,2,1,5,6,4};
        new BubbleSort().bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(i+1, nums[i]);
        }
    }
}