package com.lanshiqin.algorithm.leetcode.a92;

import com.lanshiqin.algorithm.leetcode.ListNode;

/**
 * 92. 反转链表 II
 * 给你单链表的头指针 head 和两个整数left 和 right ，其中left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [5], left = 1, right = 1
 * 输出：[5]
 * <p>
 * 提示：
 * <p>
 * 链表中节点数目为 n
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
 * <p>
 * 进阶： 你可以使用一趟扫描完成反转吗？
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode g = dummy;
        ListNode p = head;
        int n = left -1;
        while(n-->0){
            g = g.next;
            p = p.next;
        }
        for (int i = 0; i < right - left; i++) {
            ListNode remove = p.next;
            p.next = p.next.next;

            remove.next  = g.next;
            g.next = remove;

        }
        return dummy.next;
    }
}
