package com.lanshiqin.algorithm.leetcode.a105;

import com.lanshiqin.algorithm.leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void buildTree() {
        TreeNode root = new Solution().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.add(root);
                result.add(root.val);
                root = root.left;
            }
            root = stack.pop().right;
        }
        int[] expectedArray = {3, 9, 20, 15, 7};
        for (int i = 0; i < expectedArray.length; i++) {
            assertEquals(expectedArray[i], result.get(i));
        }
    }
}