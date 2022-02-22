package com.lanshiqin.algorithm.leetcode.a144;

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
    void preorderTraversal() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        List<Integer> result = new Solution().preorderTraversal(root);
        int[] exceptArray = {1,2,3};
        for (int i = 0; i < exceptArray.length; i++) {
            assertEquals(exceptArray[i],result.get(i));
        }
    }

    @Test
    void preorderTraversal2() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        List<Integer> result = new Solution().preorderTraversal2(root);
        int[] exceptArray = {1,2,3};
        for (int i = 0; i < exceptArray.length; i++) {
            assertEquals(exceptArray[i],result.get(i));
        }
    }
}