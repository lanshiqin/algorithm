package com.lanshiqin.code.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 数组实现的顺序栈单元测试
 * @author shiqin.lan
 */
class ArrayStackTest {


    @Test
    void arrayStackTest() {
        ArrayStack arrayStack = new ArrayStack();
        for (int i = 0; i < 10; i++) {
            Assertions.assertTrue(arrayStack.push(i));
        }
        Assertions.assertFalse(arrayStack.push("abc"));
        Assertions.assertEquals(9,arrayStack.pop());
        Assertions.assertTrue(arrayStack.push("abc"));
    }

}