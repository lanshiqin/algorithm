package com.lanshiqin.algorithm.leetcode.a103;

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
    void zigzagLevelOrder() {
        TreeNode root = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        root.left = node9;
        root.right = node20;
        node20.left = node15;
        node20.right = node7;
        List<List<Integer>> result = new Solution().zigzagLevelOrder(root);
        int[][] exceptArray = {{3},{20,9},{15,7}};
        for (int i = 0; i < exceptArray.length; i++) {
            for (int j = 0; j < exceptArray[i].length; j++) {
                assertEquals(exceptArray[i][j],result.get(i).get(j));
            }
        }
    }
}