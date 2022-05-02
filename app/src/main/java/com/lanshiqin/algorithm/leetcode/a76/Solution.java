package com.lanshiqin.algorithm.leetcode.a76;

/**
 * 76. 最小覆盖子串
 * <p>
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * <p>
 * <p>
 * 注意：
 * <p>
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：s = "a", t = "a"
 * 输出："a"
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * 输入: s = "a", t = "aa"
 * 输出: ""
 * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
 * 因此没有符合条件的子字符串，返回空字符串。
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length, t.length <= 105
 * s 和 t 由英文字母组成
 * <p>
 * 进阶：你能设计一个在 o(n) 时间内解决此问题的算法吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode-cn.com/problems/minimum-window-substring">https://leetcode-cn.com/problems/minimum-window-substring</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen == 0 || tLen == 0 || sLen < tLen) return "";
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        int[] need = new int[128];
        for (char c : charArrayT) {
            need[c]++;
        }
        int left = 0;
        int right = 0;
        int min = sLen + 1;
        int count = tLen;
        int start = 0;
        while (right < sLen) {
            char curr = charArrayS[right];
            if (need[curr] > 0) {
                count--;
            }
            need[curr]--;
            right++;
            while (count == 0) {
                if (right - left < min) {
                    min = right - left;
                    start = left;
                }
                char leftChar = charArrayS[left];
                if (need[leftChar] == 0) {
                    count++;
                }
                need[leftChar]++;
                left++;
            }
        }
        if (min == sLen + 1) return "";
        return s.substring(start, start + min);
    }
}
