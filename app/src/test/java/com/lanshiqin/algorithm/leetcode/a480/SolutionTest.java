package com.lanshiqin.algorithm.leetcode.a480;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void medianSlidingWindow() {
        int[] expectedArray = {1, -1, -1, 3, 5, 6};
        double[] result = new Solution().medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expectedArray[i], result[i]);
        }

        result = new Solution().medianSlidingWindow(new int[]{2147483647,2147483647}, 2);
        assertEquals(2147483647.0, result[0]);
    }
}