package com.lanshiqin.algorithm.leetcode.a19;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void removeNthFromEnd() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        for (int input : inputArray) {
            cursor.next = new ListNode(input);
            cursor = cursor.next;
        }
        ListNode result = new Solution().removeNthFromEnd(root.next, 2);
        int[] exceptedArray = new int[]{1, 2, 3, 5};
        for (int excepted : exceptedArray) {
            assertEquals(excepted, result.val);
            result = result.next;
        }
    }

    @Test
    void removeNthFromEnd2() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = new int[]{1};
        for (int input : inputArray) {
            cursor.next = new ListNode(input);
            cursor = cursor.next;
        }
        ListNode result = new Solution().removeNthFromEnd(root.next, 1);
        assertNull(result);
    }

    @Test
    void removeNthFromEnd3() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = new int[]{1, 2};
        for (int input : inputArray) {
            cursor.next = new ListNode(input);
            cursor = cursor.next;
        }
        ListNode result = new Solution().removeNthFromEnd(root.next, 1);
        int[] exceptedArray = new int[]{1};
        for (int excepted : exceptedArray) {
            assertEquals(excepted, result.val);
            result = result.next;
        }
    }

    @Test
    void removeNthFromEnd4() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = new int[]{1, 2};
        for (int input : inputArray) {
            cursor.next = new ListNode(input);
            cursor = cursor.next;
        }
        ListNode result = new Solution().removeNthFromEnd(root.next, 2);
        int[] exceptedArray = new int[]{2};
        for (int excepted : exceptedArray) {
            assertEquals(excepted, result.val);
            result = result.next;
        }
    }
}