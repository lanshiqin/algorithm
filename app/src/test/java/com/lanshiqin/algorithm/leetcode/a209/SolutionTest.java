package com.lanshiqin.algorithm.leetcode.a209;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void minSubArrayLen() {
        assertEquals(2, new Solution().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        assertEquals(1, new Solution().minSubArrayLen(4, new int[]{1, 4, 4}));
        assertEquals(0, new Solution().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals(3, new Solution().minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
    }
}