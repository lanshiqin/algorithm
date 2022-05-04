package com.lanshiqin.algorithm.leetcode.a424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void characterReplacement() {
        assertEquals(4, new Solution().characterReplacement("ABAB", 2));
        assertEquals(4, new Solution().characterReplacement("AABABBA", 1));
        assertEquals(4, new Solution().characterReplacement("ABBB", 2));
    }
}