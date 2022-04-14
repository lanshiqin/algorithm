package com.lanshiqin.algorithm.leetcode.a153;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findMin() {
        assertEquals(1,new Solution().findMin(new int[]{3,4,5,1,2}));
        assertEquals(0,new Solution().findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(11,new Solution().findMin(new int[]{11,13,15,17}));
        assertEquals(1,new Solution().findMin(new int[]{3,1,2}));
    }
}