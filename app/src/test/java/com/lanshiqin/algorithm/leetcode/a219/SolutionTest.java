package com.lanshiqin.algorithm.leetcode.a219;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void containsNearbyDuplicate() {
        assertTrue(new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(new Solution().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        assertTrue(new Solution().containsNearbyDuplicate(new int[]{0, 1, 2, 3, 2, 5}, 3));
        assertFalse(new Solution().containsNearbyDuplicate(new int[]{1, 2, 1}, 0));
        assertFalse(new Solution().containsNearbyDuplicate(new int[]{1, 2, 1}, 1));
        assertTrue(new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9}, 3));
    }
}