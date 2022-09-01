package com.lanshiqin.code.stack;

import com.lanshiqin.code.linked.ListNode;

/**
 * 链表实现的链式栈
 * 栈特性：后进先出
 * 只支持在一端操作 压栈 push 和 出栈 pop 操作，栈满 push 失败， 栈空 pop 为 null
 *
 * @author shiqin.lan
 */
public class LinkedStack {

    private ListNode currentNode;

    /**
     * 将目标数据压栈
     * 采用头插法，新数据插入头部
     *
     * @param obj 目标数据
     * @return 压栈成功返回true
     */
    public boolean push(Object obj) {
        ListNode node = new ListNode();
        node.val = obj;
        node.next = currentNode;
        currentNode = node;
        return true;
    }

    /**
     * 将栈顶元素出栈
     * 将当前头节点出栈，链表头部指向下一个
     * 需要判断当前栈是否还有元素，没有元素返回null值
     *
     * @return 栈顶元素
     */
    public Object pop() {
        if (currentNode == null) {
            return null;
        }
        Object obj = currentNode.val;
        currentNode = currentNode.next;
        return obj;
    }
}
