package com.lanshiqin.code.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 链表实现的链式栈单元测试
 *
 * @author shiqin.lan
 */
class LinkedStackTest {

    @Test
    void linkedStackTest() {
        LinkedStack stack = new LinkedStack();
        for (int i = 0; i < 1000; i++) {
            Assertions.assertTrue(stack.push(i));
        }
        for (int i = 999; i >= 0; i--) {
            Assertions.assertEquals(i, stack.pop());
        }
        Assertions.assertNull(stack.pop());
    }
}