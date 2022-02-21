package com.lanshiqin.algorithm.leetcode.a215;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findKthLargest() {
        assertEquals(5,new Solution().findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4,new Solution().findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}