package com.lanshiqin.algorithm.leetcode.a1493;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void longestSubarray() {
        assertEquals(3, new Solution().longestSubarray(new int[]{1, 1, 0, 1}));
        assertEquals(5, new Solution().longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        assertEquals(2, new Solution().longestSubarray(new int[]{1, 1, 1}));
        assertEquals(0, new Solution().longestSubarray(new int[]{0, 0, 0}));
        assertEquals(1, new Solution().longestSubarray(new int[]{0, 0, 1}));
    }
}