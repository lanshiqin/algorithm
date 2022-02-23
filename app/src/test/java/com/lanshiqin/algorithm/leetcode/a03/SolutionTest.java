package com.lanshiqin.algorithm.leetcode.a03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3,new Solution().lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1,new Solution().lengthOfLongestSubstring("bbbbb"));
        assertEquals(3,new Solution().lengthOfLongestSubstring("pwwkew"));
    }
}