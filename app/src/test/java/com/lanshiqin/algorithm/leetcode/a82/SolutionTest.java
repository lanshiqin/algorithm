package com.lanshiqin.algorithm.leetcode.a82;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void deleteDuplicates() {
        ListNode head = new ListNode();
        ListNode root = head;
        int[] inputArray = {1, 2, 3, 3, 4, 4, 5};
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        ListNode result = new Solution().deleteDuplicates(head.next);
        int[] exceptedArray = {1, 2, 5};
        for (int excepted : exceptedArray) {
            assertEquals(excepted, result.val);
            result = result.next;
        }
    }

    @Test
    void deleteDuplicates2() {
        ListNode head = new ListNode();
        ListNode root = head;
        int[] inputArray = {1, 1, 1, 2, 3};
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        ListNode result = new Solution().deleteDuplicates(head.next);
        int[] exceptedArray = {2, 3};
        for (int excepted : exceptedArray) {
            assertEquals(excepted, result.val);
            result = result.next;
        }
    }
}