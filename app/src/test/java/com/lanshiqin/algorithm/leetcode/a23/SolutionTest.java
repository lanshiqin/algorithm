package com.lanshiqin.algorithm.leetcode.a23;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void mergeKLists() {
        int[][] inputArr = {{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] listNodes = new ListNode[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            ListNode head = new ListNode(0);
            ListNode root = head;
            for (int j = 0; j < inputArr[i].length; j++) {
                head.next = new ListNode(inputArr[i][j]);
                head = head.next;
            }
            listNodes[i] = root.next;
        }
        ListNode result = new Solution().mergeKLists(listNodes);
        int[] expectedArr = {1, 1, 2, 3, 4, 4, 5, 6};
        for (int expected : expectedArr) {
            assertEquals(expected, result.val);
            result = result.next;
        }
    }
}