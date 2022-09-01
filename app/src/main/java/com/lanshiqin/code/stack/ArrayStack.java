package com.lanshiqin.code.stack;

/**
 * 数组实现的顺序栈
 * 栈特性：后进先出
 * 只支持压栈 push 和 出栈 pop 操作，栈满 push 失败， 栈空 pop 为 null
 *
 * @author shiqin.lan
 */
public class ArrayStack {

    /**
     * 存放栈元素的数组容器
     */
    private final Object[] items;

    /**
     * 栈默认大小
     */
    private int size = 10;

    /**
     * 栈顶元素指针
     */
    private int position = -1;

    /**
     * 构造函数 实例化默认大小的栈
     */
    public ArrayStack() {
        items = new Object[size];
    }

    /**
     * 构造函数 实例化指定大小的栈
     *
     * @param initSize 指定栈空间的大小
     */
    public ArrayStack(int initSize) {
        size = initSize;
        items = new Object[size];
    }

    /**
     * 将目标数据压栈
     * 压栈时需要判断栈是否已满，栈满时压栈失败返回false
     * 压栈后栈顶指针要往上移动一个单位
     *
     * @param obj 目标数据
     * @return 成功true 失败false
     */
    public boolean push(Object obj) {
        if (position + 1 >= size) {
            return false;
        }
        items[++position] = obj;
        return true;
    }

    /**
     * 将栈顶元素出栈
     * 出栈后栈顶指针要往下移动一个单位
     * 栈空时返回 null
     *
     * @return 栈顶元素
     */
    public Object pop() {
        if (position < 0) {
            return null;
        }
        return items[position--];
    }
}
