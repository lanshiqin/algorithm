package com.lanshiqin.algorithm.leetcode.a20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isValid() {
        Assertions.assertTrue(new Solution().isValid("()"));
        Assertions.assertTrue(new Solution().isValid("()[]{}"));
        Assertions.assertFalse(new Solution().isValid("([)]"));
        Assertions.assertTrue(new Solution().isValid("{[]}"));
        Assertions.assertFalse(new Solution().isValid("(("));
    }
}