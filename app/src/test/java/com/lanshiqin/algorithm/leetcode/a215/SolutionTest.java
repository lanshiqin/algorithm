package com.lanshiqin.algorithm.leetcode.a215;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solutionOne() {
        assertEquals(5,new Solution().solutionOne(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4,new Solution().solutionOne(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    @Test
    void solutionTwo() {
        assertEquals(5,new Solution().solutionTwo(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4,new Solution().solutionTwo(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    @Test
    void solutionThree() {
        assertEquals(5,new Solution().solutionThree(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4,new Solution().solutionThree(new int[]{3,2,3,1,2,4,5,5,6}, 4));
        assertEquals(9,new Solution().solutionThree(new int[]{9,9,12,5,10,6}, 3));
    }
}