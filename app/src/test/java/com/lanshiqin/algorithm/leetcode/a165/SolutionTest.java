package com.lanshiqin.algorithm.leetcode.a165;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void compareVersion() {
        assertEquals(0,new Solution().compareVersion("1.01","1.001"));
        assertEquals(0,new Solution().compareVersion("1.0","1.0.0"));
        assertEquals(-1,new Solution().compareVersion("0.1","1.1"));
    }
}