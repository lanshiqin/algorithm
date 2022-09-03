package com.lanshiqin.code.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 数组实现的顺序队列单元测试
 *
 * @author shiqin.lan
 */
class ArrayQueueTest {

    @Test
    void arrayQueueTest() {
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 10; i++) {
            Assertions.assertTrue(queue.enqueue(i));
        }
        Assertions.assertFalse(queue.enqueue(10));
        for (int i = 0; i < 10; i++) {
            Assertions.assertEquals(i, queue.dequeue());
        }
        Assertions.assertNull(queue.dequeue());
        Assertions.assertTrue(queue.enqueue(10));
        Assertions.assertEquals(10, queue.dequeue());

        for (int i = 0; i < 100; i++) {
            Assertions.assertTrue(queue.enqueue(i));
            Assertions.assertEquals(i, queue.dequeue());
        }
        Assertions.assertNull(queue.dequeue());

        queue = new ArrayQueue(10000);
        for (int i = 0; i < 10000; i++) {
            Assertions.assertTrue(queue.enqueue(i));
        }
        for (int i = 0; i < 10000; i++) {
            Assertions.assertEquals(i, queue.dequeue());
        }
        Assertions.assertNull(queue.dequeue());
    }
}