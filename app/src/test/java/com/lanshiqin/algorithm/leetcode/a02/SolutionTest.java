package com.lanshiqin.algorithm.leetcode.a02;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void addTwoNumbers() {

        int[] l1Array = new int[]{2, 4, 3};
        ListNode l1Head = new ListNode();
        ListNode l1 = new ListNode(0);
        l1Head.next = l1;
        for (int value : l1Array) {
            l1.next = new ListNode(value);
            l1 = l1.next;
        }

        int[] l2Array = new int[]{5, 6, 4};
        ListNode l2Head = new ListNode();
        ListNode l2 = new ListNode(0);
        l2Head.next = l2;
        for (int value : l2Array) {
            l2.next = new ListNode(value);
            l2 = l2.next;
        }
        int i = 0;
        int[] resultArray = new int[]{7, 0, 8};
        ListNode result = new Solution().addTwoNumbers(l1Head.next.next, l2Head.next.next);
        while (result != null) {
            assertEquals(resultArray[i++], result.val);
            result = result.next;
        }

    }

    @Test
    void addTwoNumbers2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        int i = 0;
        int[] resultArray = new int[]{0};
        ListNode result = new Solution().addTwoNumbers(l1, l2);
        while (result != null) {
            assertEquals(resultArray[i++], result.val);
            result = result.next;
        }
    }

    @Test
    void addTwoNumbers3() {
        int[] l1Array = new int[]{9, 9, 9, 9, 9, 9, 9};
        ListNode l1Head = new ListNode();
        ListNode l1 = new ListNode(0);
        l1Head.next = l1;
        for (int value : l1Array) {
            l1.next = new ListNode(value);
            l1 = l1.next;
        }

        int[] l2Array = new int[]{9, 9, 9, 9};
        ListNode l2Head = new ListNode();
        ListNode l2 = new ListNode(0);
        l2Head.next = l2;
        for (int value : l2Array) {
            l2.next = new ListNode(value);
            l2 = l2.next;
        }
        int i = 0;
        int[] resultArray = new int[]{8, 9, 9, 9, 0, 0, 0, 1};
        ListNode result = new Solution().addTwoNumbers(l1Head.next.next, l2Head.next.next);
        while (result != null) {
            assertEquals(resultArray[i++], result.val);
            result = result.next;
        }
    }
}