package com.lanshiqin.algorithm.leetcode.a76;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void minWindow() {
        assertEquals("BANC", new Solution().minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("a", new Solution().minWindow("a", "a"));
        assertEquals("", new Solution().minWindow("a", "aa"));
    }
}