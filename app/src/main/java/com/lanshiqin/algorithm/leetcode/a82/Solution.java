package com.lanshiqin.algorithm.leetcode.a82;

import com.lanshiqin.algorithm.leetcode.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 82. 删除排序链表中的重复元素 II
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中没有重复出现的数字。
 * <p>
 * 返回同样按升序排列的结果链表。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [1,1,1,2,3]
 * 输出：[2,3]
 * <p>
 * 提示：
 * <p>
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序排列
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Map<Integer, Integer> map = new HashMap<>();
        ListNode root = head;
        while (root != null) {
            Integer key = root.val;
            Integer count = map.get(key);
            if (count != null) {
                map.put(key, ++count);
            } else {
                map.put(key, 1);
            }
            root = root.next;
        }
        root = new ListNode();
        root.next = head;
        head = root;
        while (head != null && head.next != null) {
            Integer key = head.next.val;
            Integer count = map.get(key);
            if (count != 1) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return root.next;
    }
}
