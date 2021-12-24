package com.lanshiqin.algorithm.leetcode.a160;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getIntersectionNode() {
        int[] tailArray = {8, 4, 5};
        ListNode tailPreNode = new ListNode();
        ListNode tailPre = tailPreNode;
        for (int value : tailArray) {
            tailPreNode.next = new ListNode(value);
            tailPreNode = tailPreNode.next;
        }
        int[] a = {4, 1};
        ListNode listAPrev = new ListNode();
        ListNode listA = listAPrev;
        for (int value : a) {
            listAPrev.next = new ListNode(value);
            listAPrev = listAPrev.next;
        }
        listAPrev.next = tailPre.next;

        int[] b = {5, 6, 1};
        ListNode listBPrev = new ListNode();
        ListNode listB = listBPrev;
        for (int value : b) {
            listBPrev.next = new ListNode(value);
            listBPrev = listBPrev.next;
        }
        listBPrev.next = tailPre.next;
        ListNode result = new Solution().getIntersectionNode(listA.next, listB.next);
        for (int value : tailArray) {
            assertEquals(value, result.val);
            result = result.next;
        }
    }
}