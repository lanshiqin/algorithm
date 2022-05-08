package com.lanshiqin.algorithm.leetcode.a1493;

/**
 * 1493. 删掉一个元素以后全为 1 的最长子数组
 * <p>
 * 给你一个二进制数组 nums ，你需要从中删掉一个元素。
 * <p>
 * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
 * <p>
 * 如果不存在这样的子数组，请返回 0 。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,0,1]
 * 输出：3
 * 解释：删掉位置 2 的数后，[1,1,1] 包含 3 个 1 。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [0,1,1,1,0,1,1,0,1]
 * 输出：5
 * 解释：删掉位置 4 的数字后，[0,1,1,1,1,1,0,1] 的最长全 1 子数组为 [1,1,1,1,1] 。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：nums = [1,1,1]
 * 输出：2
 * 解释：你必须要删除一个元素。
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 105
 * nums[i] 要么是 0 要么是 1 。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode-cn.com/problems/longest-subarray-of-1s-after-deleting-one-element">https://leetcode-cn.com/problems/longest-subarray-of-1s-after-deleting-one-element</a>
 * <p>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int res = 0;
        int count = 0;
        while (right < n) {
            if (nums[right] == 0) {
                count++;
            }
            while (count > 1) {
                if (nums[left++] == 0) {
                    count--;
                }
            }
            res = Math.max(res, right - left);
            right++;
        }
        return res;
    }
}
