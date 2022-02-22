package com.lanshiqin.algorithm.leetcode.a94;

import com.lanshiqin.algorithm.leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.right = node1;
        TreeNode node2 = new TreeNode(3);
        node1.left = node2;
        List<Integer> nodeList = new Solution().inorderTraversal(root);
        for (Integer node : nodeList) {
            System.out.println(node);
        }
    }

    @Test
    void inorderTraversal2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.right = node1;
        TreeNode node2 = new TreeNode(3);
        node1.left = node2;
        List<Integer> nodeList = new Solution().inorderTraversal2(root);
        for (Integer node : nodeList) {
            System.out.println(node);
        }
    }
}