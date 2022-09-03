package com.lanshiqin.code.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 链表实现的链式无界队列单元测试
 *
 * @author shiqin.lan
 */
class LinkedQueueTest {

    @Test
    void linkedQueueTest() {
        LinkedQueue queue = new LinkedQueue();
        for (int i = 0; i < 1000000; i++) {
            Assertions.assertTrue(queue.enqueue(i));
        }
        for (int i = 0; i < 1000000; i++) {
            Assertions.assertEquals(i, queue.dequeue());
        }
    }
}