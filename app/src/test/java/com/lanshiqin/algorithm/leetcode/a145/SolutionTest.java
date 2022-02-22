package com.lanshiqin.algorithm.leetcode.a145;

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
    void postorderTraversal() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        List<Integer> result = new Solution().postorderTraversal(root);
        int[] exceptArray = {3,2,1};
        for (int i = 0; i < exceptArray.length; i++) {
            assertEquals(exceptArray[i],result.get(i));
        }
    }

    @Test
    void postorderTraversal2() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        List<Integer> result = new Solution().postorderTraversal2(root);
        int[] exceptArray = {3,2,1};
        for (int i = 0; i < exceptArray.length; i++) {
            assertEquals(exceptArray[i],result.get(i));
        }
    }
}