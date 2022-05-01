package com.lanshiqin.algorithm.leetcode.a03;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * <p>
 * 给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
 * <p>
 * <p>
 * 示例1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 * <p>
 * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s由英文字母、数字、符号和空格组成
 * 通过次数1,502,150提交次数3,902,071
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters">https://leetcode-cn.com/problems/longest-substring-without-repeating-characters</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (map.containsKey(curr)) {
                left = Math.max(left, map.get(curr) + 1);
            }
            map.put(curr, i);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.isEmpty()) return 0;
        int left = 0;
        int right = 0;
        int maxLen = 1;
        int len = s.length() - 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        while (right < len) {
            right++;
            Character curr = s.charAt(right);
            if (map.containsKey(curr)) {
                left = Math.max(left, map.get(curr) + 1);
            }
            map.put(curr, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
