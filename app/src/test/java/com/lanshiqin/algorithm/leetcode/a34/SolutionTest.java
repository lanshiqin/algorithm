package com.lanshiqin.algorithm.leetcode.a34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void searchRange() {
        int[] result = new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);

        result = new Solution().searchRange(new int[]{1}, 1);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);

        result = new Solution().searchRange2(new int[]{1, 4}, 4);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void searchRange2() {
        int[] result = new Solution().searchRange2(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);

        result = new Solution().searchRange2(new int[]{1}, 1);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);

        result = new Solution().searchRange2(new int[]{1, 4}, 4);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);

    }
}