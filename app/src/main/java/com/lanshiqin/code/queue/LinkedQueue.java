package com.lanshiqin.code.queue;

import com.lanshiqin.code.linked.ListNode;

/**
 * 链表实现的链式无界队列
 * 队列特性：先进先出，只能在两端操作，队尾进，队头出
 * 链表实现的无界队列，入队时无需判断是否队满，但出队时依然要判断是否队空
 */
public class LinkedQueue {

    /**
     * 队头节点
     */
    private ListNode head;

    /**
     * 队尾节点
     */
    private ListNode tail;

    public LinkedQueue() {
        head = new ListNode();
        tail = head;
    }

    /**
     * 入队操作
     * 将目标元素添加到队尾，尾插法
     *
     * @param obj 目标元素
     * @return 入队成功true
     */
    public boolean enqueue(Object obj) {
        ListNode node = new ListNode();
        node.val = obj;
        tail.next = node;
        tail = node;
        return true;
    }

    /**
     * 出对操作
     * 将队头元素出队，需要判断队列是否为空
     * 如果head == tail则表示队列为空，返回null
     *
     * @return 队头元素
     */
    public Object dequeue() {
        if (head == tail) {
            return null;
        }
        Object val = head.next.val;
        head = head.next;
        return val;
    }
}
