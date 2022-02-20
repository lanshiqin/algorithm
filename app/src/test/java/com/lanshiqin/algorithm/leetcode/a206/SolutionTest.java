package com.lanshiqin.algorithm.leetcode.a206;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void reverseList() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = {1, 2, 3, 4, 5};
        for (int value : inputArray) {
            cursor.next = new ListNode(value);
            cursor = cursor.next;
        }
        ListNode result = new Solution().reverseList(root.next);
        int[] expectedArray = {5, 4, 3, 2, 1};
        for (int expected : expectedArray) {
            assertEquals(expected, result.val);
            result = result.next;
        }
    }

    @Test
    void reverseList2() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = {1, 2};
        for (int value : inputArray) {
            cursor.next = new ListNode(value);
            cursor = cursor.next;
        }
        ListNode result = new Solution().reverseList(root.next);
        int[] expectedArray = {2, 1};
        for (int expected : expectedArray) {
            assertEquals(expected, result.val);
            result = result.next;
        }
    }

    @Test
    void reverseList3() {
        assertNull(new Solution().reverseList(null));
    }

    @Test
    void reverseList4() {
        ListNode root = new ListNode();
        ListNode cursor = root;
        int[] inputArray = {1, 2, 3, 4, 5};
        for (int value : inputArray) {
            cursor.next = new ListNode(value);
            cursor = cursor.next;
        }
        ListNode result = new Solution().reverseListTwo(root.next);
        int[] expectedArray = {5, 4, 3, 2, 1};
        for (int expected : expectedArray) {
            assertEquals(expected, result.val);
            result = result.next;
        }
    }
}