package com.lanshiqin.algorithm.leetcode.a125;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isPalindrome() {
        assertTrue(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(new Solution().isPalindrome("race a car"));
        assertTrue(new Solution().isPalindrome(""));
        assertTrue(new Solution().isPalindrome(" "));
    }
}