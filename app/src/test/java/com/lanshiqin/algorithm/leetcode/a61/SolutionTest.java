package com.lanshiqin.algorithm.leetcode.a61;

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
    void rotateRight() {
        int[] inputArray = {1, 2, 3, 4, 5};
        ListNode head = new ListNode();
        ListNode root = head;
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        int k = 2;
        ListNode result = new Solution().rotateRight(head.next, k);
        int[] exceptedArray = {4,5,1,2,3};
        for (int excepted: exceptedArray){
            Assertions.assertEquals(excepted, result.val);
            result = result.next;
        }
    }

    @Test
    void rotateRight2() {
        int[] inputArray = {0,1,2};
        ListNode head = new ListNode();
        ListNode root = head;
        for (int input : inputArray) {
            root.next = new ListNode(input);
            root = root.next;
        }
        int k = 4;
        ListNode result = new Solution().rotateRight(head.next, k);
        int[] exceptedArray = {2,0,1};
        for (int excepted: exceptedArray){
            Assertions.assertEquals(excepted, result.val);
            result = result.next;
        }
    }
}