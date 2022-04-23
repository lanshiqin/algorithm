package com.lanshiqin.algorithm.leetcode.a33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void search() {
        assertEquals(4,new Solution().search(new int[]{4,5,6,7,0,1,2},0));
        assertEquals(-1,new Solution().search(new int[]{4,5,6,7,0,1,2},3));
        assertEquals(-1,new Solution().search(new int[]{1},0));
    }

    @Test
    void search2() {
        assertEquals(4,new Solution().search2(new int[]{4,5,6,7,0,1,2},0));
        assertEquals(-1,new Solution().search2(new int[]{4,5,6,7,0,1,2},3));
        assertEquals(-1,new Solution().search2(new int[]{1},0));
        assertEquals(1,new Solution().search2(new int[]{1,3},3));
        assertEquals(2,new Solution().search2(new int[]{5,1,3},3));
    }
}