package com.lanshiqin.algorithm.leetcode.a24;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void swapPairs() {
        int[] inputArray = {1,2,3,4};
        ListNode root = new ListNode();
        ListNode head = root;
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        ListNode result = new Solution().swapPairs(head.next);
        int[] exceptArray = {2,1,4,3};
        for (int except : exceptArray) {
            assertEquals(except, result.val);
            result = result.next;
        }
    }
}