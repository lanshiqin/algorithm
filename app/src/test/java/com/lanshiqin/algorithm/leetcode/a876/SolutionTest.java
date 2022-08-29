package com.lanshiqin.algorithm.leetcode.a876;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void middleNode() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        for (int input : inputArray) {
            cursor.next = new ListNode(input);
            cursor = cursor.next;
        }
        ListNode result = new Solution().middleNode(root.next);
        int[] exceptedArray = new int[]{3, 4, 5};
        for (int excepted : exceptedArray) {
            assertEquals(excepted, result.val);
            result = result.next;
        }
    }

    @Test
    void middleNode2() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = new int[]{1, 2, 3, 4};
        for (int input : inputArray) {
            cursor.next = new ListNode(input);
            cursor = cursor.next;
        }
        ListNode result = new Solution().middleNode(root.next);
        int[] exceptedArray = new int[]{3, 4};
        for (int excepted : exceptedArray) {
            assertEquals(excepted, result.val);
            result = result.next;
        }
    }
}