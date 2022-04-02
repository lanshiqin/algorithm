package com.lanshiqin.algorithm.leetcode.a242;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isAnagram() {
        assertTrue(new Solution().isAnagram("anagram","nagaram"));
        assertFalse(new Solution().isAnagram("rat","car"));
    }

    @Test
    void isAnagram2() {
        assertTrue(new Solution().isAnagram2("anagram","nagaram"));
        assertFalse(new Solution().isAnagram2("rat","car"));
    }

    @Test
    void isAnagram3() {
        assertTrue(new Solution().isAnagram3("我爱你","你爱我"));
        assertFalse(new Solution().isAnagram3("我爱你","你也爱我"));
    }
}