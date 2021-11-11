package com.lanshiqin.algorithm.leetcode.a21;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode();
        ListNode root = l1;
        int[] l1Array = {1, 2, 4};
        for (int value : l1Array) {
            root.next = new ListNode(value);
            root = root.next;
        }
        ListNode l2 = new ListNode();
        root = l2;
        int[] l2Array = {1, 3, 4};
        for (int value : l2Array) {
            root.next = new ListNode(value);
            root = root.next;
        }
        int[] resultArray = {1, 1, 2, 3, 4, 4};
        ListNode result = new Solution().mergeTwoLists(l1.next, l2.next);
        for (int value : resultArray) {
            assertEquals(value, result.val);
            result = result.next;
        }
    }

    @Test
    void mergeTwoLists1() {
        ListNode result = new Solution().mergeTwoLists(null, null);
        assertNull(result);
    }

    @Test
    void mergeTwoLists2() {
        ListNode l2 = new ListNode();
        ListNode root = l2;
        int[] l2Array = {0};
        for (int value : l2Array) {
            root.next = new ListNode(value);
            root = root.next;
        }
        int[] resultArray = {0};
        ListNode result = new Solution().mergeTwoLists(null, l2.next);
        for (int value : resultArray) {
            assertEquals(value, result.val);
            result = result.next;
        }
    }
}