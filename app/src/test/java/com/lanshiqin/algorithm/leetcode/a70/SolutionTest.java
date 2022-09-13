package com.lanshiqin.algorithm.leetcode.a70;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void climbStairs() {
        Assertions.assertEquals(2, new Solution().climbStairs(2));
        Assertions.assertEquals(3, new Solution().climbStairs(3));
    }
}