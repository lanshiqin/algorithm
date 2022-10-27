package com.lanshiqin.algorithm.leetcode.a35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void searchInsert() {
        assertEquals(2, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(1, new Solution().searchInsert(new int[]{1, 3}, 2));
    }
}