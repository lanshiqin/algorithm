package com.lanshiqin.algorithm.leetcode.a125;

/**
 * 125. 验证回文串
 * <p>
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 2 * 105
 * 字符串 s 由 ASCII 字符组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode-cn.com/problems/valid-palindrome">https://leetcode-cn.com/problems/valid-palindrome</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return true;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            char c1 = s.charAt(left);
            if (unChar(c1)) {
                left++;
                continue;
            }
            char c2 = s.charAt(right);
            if (unChar(c2)) {
                right--;
                continue;
            }
            if ((c1 & 0xDF) != (c2 & 0xDF)) return false;
            left++;
            right--;
        }
        return true;
    }

    private boolean unChar(Character c) {
        return (c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z');
    }
}
