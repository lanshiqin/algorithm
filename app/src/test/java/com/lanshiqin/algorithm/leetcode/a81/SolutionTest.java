package com.lanshiqin.algorithm.leetcode.a81;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void search() {
        assertTrue(new Solution().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        assertFalse(new Solution().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
        assertTrue(new Solution().search(new int[]{1, 0, 1, 1, 1}, 0));
        assertFalse(new Solution().search(new int[]{1}, 0));
        assertTrue(new Solution().search(new int[]{1}, 1));
        assertTrue(new Solution().search(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1}, 2));
    }
}