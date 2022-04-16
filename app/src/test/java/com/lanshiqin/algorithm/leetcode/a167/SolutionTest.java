package com.lanshiqin.algorithm.leetcode.a167;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void twoSum() {
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(new Solution().twoSum(new int[]{2, 3, 4}, 6)));
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(new Solution().twoSum(new int[]{-1, 0}, -1)));
    }
}