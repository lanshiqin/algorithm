package com.lanshiqin.code.queue;

/**
 * 数组实现的顺序队列
 * 队列特性：先进先出，只能在两端操作，队尾进，队头出
 * 入队时要判断是否队满，出队时要判断是否队空
 *
 * @author shiqin.lan
 */
public class ArrayQueue {

    /**
     * 队头指针
     */
    private int head;

    /**
     * 队尾指针
     */
    private int tail;

    /**
     * 存储队列元素的数组
     */
    private final Object[] items;

    /**
     * 队列默认容量大小
     */
    private int capacity = 10;

    /**
     * 初始化默认大小的队列
     */
    public ArrayQueue() {
        items = new Object[capacity];
        head = tail = 0;
    }

    /**
     * 初始化指定大小的队列
     *
     * @param initSize 队列大小
     */
    public ArrayQueue(int initSize) {
        this.capacity = initSize;
        items = new Object[capacity];
        head = tail = 0;
    }

    /**
     * 入队操作
     * 将目标对象加入队尾，如果队列已满则入队失败
     * 如果队尾指针已经到达队尾要判断队头指针是否在最前面的位置，如果是则队满，
     * 否则要搬移数组元素往前挪，最坏时间复杂度O（n）
     *
     * @param obj 目标对象
     * @return 入队成功true，失败false
     */
    public boolean enqueue(Object obj) {
        if (tail == capacity) {
            if (head == 0) {
                return false;
            } else {
                int count = tail - head;
                for (int i = 0; i < count; i++) {
                    items[i] = items[head++];
                }
                head = 0;
                tail = count;
            }
        }
        items[tail++] = obj;
        return true;
    }

    /**
     * 出队操作
     * 将队头元素出队，如果队列为空则返回null
     *
     * @return 队头元素
     */
    public Object dequeue() {
        if (head == tail) {
            return null;
        }
        return items[head++];
    }
}
