package com.lanshiqin.algorithm.leetcode.a485;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findMaxConsecutiveOnes() {
        assertEquals(3, new Solution().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        assertEquals(2, new Solution().findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
        assertEquals(1, new Solution().findMaxConsecutiveOnes(new int[]{0, 0, 0, 1, 0, 0}));
        assertEquals(1, new Solution().findMaxConsecutiveOnes(new int[]{0, 0, 0, 0, 0, 1}));
        assertEquals(0, new Solution().findMaxConsecutiveOnes(new int[]{0, 0, 0, 0, 0, 0}));
    }
}