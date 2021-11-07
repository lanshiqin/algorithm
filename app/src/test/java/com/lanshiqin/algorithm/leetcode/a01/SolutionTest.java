package com.lanshiqin.algorithm.leetcode.a01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new Solution().twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

        nums = new int[]{3, 2, 4};
        target = 6;
        result = new Solution().twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);

        nums = new int[]{3, 3};
        result = new Solution().twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

    }

    @Test
    void twoSum2() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new Solution().twoSum2(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

        nums = new int[]{3, 2, 4};
        target = 6;
        result = new Solution().twoSum2(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);

        nums = new int[]{3, 3};
        result = new Solution().twoSum2(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

    }
}