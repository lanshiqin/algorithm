package com.lanshiqin.algorithm.leetcode.a94;

import com.lanshiqin.algorithm.leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.right = node1;
        node1.left = new TreeNode(3);
        int[] expectedArray = {1, 3, 2};
        List<Integer> nodeList = new Solution().inorderTraversal(root);
        for (int i = 0; i < expectedArray.length; i++) {
            assertEquals(expectedArray[i], nodeList.get(i));
        }
    }

    @Test
    void inorderTraversal2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.right = node1;
        node1.left = new TreeNode(3);
        int[] expectedArray = {1, 3, 2};
        List<Integer> nodeList = new Solution().inorderTraversal2(root);
        for (int i = 0; i < expectedArray.length; i++) {
            assertEquals(expectedArray[i], nodeList.get(i));
        }
    }
}