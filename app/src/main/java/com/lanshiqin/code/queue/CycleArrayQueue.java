package com.lanshiqin.code.queue;

/**
 * 循环数组实现的队列
 * 可以避免数组实现的顺序队列需要搬移数据的问题
 * 队空判断 head == tail， 队满判断 (tail+1)%capacity == head
 *
 * @author shiqin.lan
 */
public class CycleArrayQueue {

    /**
     * 队头位置
     */
    private int head;

    /**
     * 队尾位置
     */
    private int tail;

    /**
     * 队列大小
     */
    private final int capacity;

    /**
     * 存放队列元素的数组
     */
    private final Object[] items;

    /**
     * 构造循环队列
     *
     * @param initSize 指定队列大小
     */
    public CycleArrayQueue(int initSize) {
        this.capacity = initSize;
        items = new Object[capacity];
        head = tail = 0;
    }

    /**
     * 向队列尾部添加目标元素
     * 判断队列是否已满
     *
     * @param obj 目标元素
     * @return 添加成功true，队满时添加失败false
     */
    public boolean enqueue(Object obj) {
        if ((tail + 1) % capacity == head) {
            return false;
        }
        items[tail] = obj;
        tail = (tail + 1) % capacity;
        return true;
    }

    /**
     * 从队头取出元素，队列为空时返回null
     *
     * @return 队头元素
     */
    public Object dequeue() {
        if (head == tail) {
            return null;
        }
        Object val = items[head];
        head = (head + 1) % capacity;
        return val;
    }
}
