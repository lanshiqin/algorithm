package com.lanshiqin.algorithm.leetcode.a15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void threeSum() {
        List<List<Integer>> lists = new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        int[] expectedArray1 = {-1, -1, 2};
        int[] expectedArray2 = {-1, 0, 1};
        for (int i = 0; i < lists.get(0).size(); i++) {
            assertEquals(expectedArray1[i], lists.get(0).get(i));
        }
        for (int i = 0; i < lists.get(1).size(); i++) {
            assertEquals(expectedArray2[i], lists.get(1).get(i));
        }

    }
}