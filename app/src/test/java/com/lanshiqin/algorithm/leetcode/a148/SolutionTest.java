package com.lanshiqin.algorithm.leetcode.a148;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sortList() {
        int[] inputArr = {4, 2, 1, 3};
        ListNode root = new ListNode();
        ListNode dummy = root;
        for (int input : inputArr) {
            root.next = new ListNode(input);
            root = root.next;
        }
        ListNode result = new Solution().sortList(dummy.next);
        int[] exceptArr = {1, 2, 3, 4};
        for (int except : exceptArr) {
            assertEquals(except, result.val);
            result = result.next;
        }
    }
}