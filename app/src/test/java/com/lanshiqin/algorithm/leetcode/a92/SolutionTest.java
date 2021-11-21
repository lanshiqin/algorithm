package com.lanshiqin.algorithm.leetcode.a92;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void reverseBetween() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = {1, 2, 3, 4, 5};
        for (int input : inputArray) {
            cursor.next = new ListNode(input);
            cursor = cursor.next;
        }
        int[] expectedArray = {1, 4, 3, 2, 5};
        ListNode result = new Solution().reverseBetween(root.next, 2, 4);
        for (int expected : expectedArray) {
            assertEquals(expected, result.val);
            result = result.next;
        }
    }
}