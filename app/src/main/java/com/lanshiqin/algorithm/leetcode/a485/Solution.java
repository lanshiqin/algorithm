package com.lanshiqin.algorithm.leetcode.a485;

/**
 * 485. 最大连续 1 的个数
 * <p>
 * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,0,1,1,1]
 * 输出：3
 * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入：nums = [1,0,1,1,0,1]
 * 输出：2
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 105
 * nums[i] 不是 0 就是 1.
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode-cn.com/problems/max-consecutive-ones">https://leetcode-cn.com/problems/max-consecutive-ones</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int res = 0;
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[right] != 1) {
                res = Math.max(res, right - left);
                left = right + 1;
            }
            right++;
        }
        return Math.max(res, right - left);
    }
}
