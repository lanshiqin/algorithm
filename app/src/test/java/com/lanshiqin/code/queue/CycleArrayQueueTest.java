package com.lanshiqin.code.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 循环数组实现的队列单元测试
 *
 * @author shiqin.lan
 */
class CycleArrayQueueTest {

    @Test
    void cycleArrayQueueTest() {
        CycleArrayQueue cycleArrayQueue = new CycleArrayQueue(101);
        for (int i = 0; i < 100; i++) {
            Assertions.assertTrue(cycleArrayQueue.enqueue(i));
        }
        Assertions.assertFalse(cycleArrayQueue.enqueue(100));

        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(i, cycleArrayQueue.dequeue());
        }
        Assertions.assertNull(cycleArrayQueue.dequeue());

        for (int i = 0; i < 1000000; i++) {
            Assertions.assertTrue(cycleArrayQueue.enqueue(i));
            Assertions.assertEquals(i, cycleArrayQueue.dequeue());
        }
        Assertions.assertNull(cycleArrayQueue.dequeue());
    }
}