package com.lanshiqin.algorithm.leetcode.a141;

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
    void hasCycle() {
        ListNode root = new ListNode();
        ListNode prev = root;
        ListNode dummy = root;
        int[] inputArray = {3, 2, 0, -4};
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        int pos = 1;
        while (pos >= 0) {
            prev = prev.next;
            pos--;
        }
        root.next = prev;
        boolean result = new Solution().hasCycle(dummy.next);
        Assertions.assertTrue(result);
        Assertions.assertFalse(new Solution().hasCycle(new ListNode(1)));
    }

    @Test
    void hasCycle2() {
        ListNode root = new ListNode();
        ListNode dummy = root;
        int[] inputArray = {-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5};
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        boolean result = new Solution().hasCycle2(dummy.next);
        Assertions.assertFalse(result);
        Assertions.assertFalse(new Solution().hasCycle2(new ListNode(1)));
    }
}