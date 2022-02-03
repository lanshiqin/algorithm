package com.lanshiqin.algorithm.leetcode.a234;

import com.lanshiqin.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isPalindrome() {
        int[] inputArray = {1,2,2,1};
        ListNode head = new ListNode();
        ListNode dummy = head;
        for (int input : inputArray) {
            dummy.next = new ListNode(input);
            dummy = dummy.next;
        }
        assertTrue(new Solution().isPalindrome(head.next));
    }

    @Test
    void isPalindrome2() {
        int[] inputArray = {1,2};
        ListNode head = new ListNode();
        ListNode dummy = head;
        for (int input : inputArray) {
            dummy.next = new ListNode(input);
            dummy = dummy.next;
        }
        assertFalse(new Solution().isPalindrome(head.next));
    }
}