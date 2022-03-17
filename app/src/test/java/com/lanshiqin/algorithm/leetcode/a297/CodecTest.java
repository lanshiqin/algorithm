package com.lanshiqin.algorithm.leetcode.a297;

import com.lanshiqin.algorithm.leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodecTest {

    TreeNode root = new TreeNode(1);
    String serializeResult;

    @BeforeEach
    void setUp() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;
        serializeResult = new Codec().serialize(root);
    }

    @Test
    void serialize() {
        assertEquals("1,2,null,null,3,4,null,null,5,null,null,",new Codec().serialize(root));
    }

    @Test
    void deserialize() {
        TreeNode deserialize = new Codec().deserialize(serializeResult);
        assertEquals("1,2,null,null,3,4,null,null,5,null,null,",new Codec().serialize(deserialize));
    }
}