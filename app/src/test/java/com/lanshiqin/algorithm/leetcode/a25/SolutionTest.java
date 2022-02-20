package com.lanshiqin.algorithm.leetcode.a25;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void reverseKGroup() {
        int[] inputArray = {1,2,3,4,5};
        ListNode root = new ListNode();
        ListNode head = root;
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        int k = 2;
        ListNode result = new Solution().reverseKGroup(head.next, k);
        int[] exceptArray = {2,1,4,3,5};
        for (int except : exceptArray) {
            assertEquals(except, result.val);
            result = result.next;
        }
    }
}