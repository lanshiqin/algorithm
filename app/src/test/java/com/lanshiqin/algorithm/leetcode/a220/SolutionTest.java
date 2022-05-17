package com.lanshiqin.algorithm.leetcode.a220;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void containsNearbyAlmostDuplicate() {
        assertTrue(new Solution().containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
        assertTrue(new Solution().containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 2));
        assertFalse(new Solution().containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
        assertTrue(new Solution().containsNearbyAlmostDuplicate(new int[]{1, 2, 2, 3, 4, 5}, 3, 0));
        assertFalse(new Solution().containsNearbyAlmostDuplicate(new int[]{-2147483648, 2147483647}, 1, 1));
        assertTrue(new Solution().containsNearbyAlmostDuplicate(new int[]{7, 1, 3}, 2, 3));
        assertFalse(new Solution().containsNearbyAlmostDuplicate(new int[]{2147483647, -1, 2147483647}, 1, 2147483647));
        assertFalse(new Solution().containsNearbyAlmostDuplicate(new int[]{2147483647, -2147483647}, 1, 2147483647));
    }
}