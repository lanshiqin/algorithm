package com.lanshiqin.algorithm.leetcode.a143;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void reorderList() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode();
        ListNode root = head;
        for (int input : inputArray) {
            head.next = new ListNode(input);
            head = head.next;
        }
        ListNode dummy = root.next;
        new Solution().reorderList(root.next);
        int[] exceptArray = new int[]{1, 5, 2, 4, 3};
        for (int except : exceptArray) {
            assertEquals(except, dummy.val);
            dummy = dummy.next;
        }
    }
}