package com.lanshiqin.algorithm.leetcode.a154;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findMin() {
        assertEquals(1, new Solution().findMin(new int[]{1, 3, 5}));
        assertEquals(0, new Solution().findMin(new int[]{2, 2, 2, 0, 1}));
    }
}