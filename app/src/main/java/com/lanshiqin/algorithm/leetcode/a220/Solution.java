package com.lanshiqin.algorithm.leetcode.a220;

import java.util.TreeSet;

/**
 * 220. 存在重复元素 III
 * <p>
 * 给你一个整数数组 nums 和两个整数 k 和 t 。请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
 * <p>
 * 如果存在则返回 true，不存在返回 false。
 * <p>
 * <p>
 * 示例1：
 * <p>
 * 输入：nums = [1,2,3,1], k = 3, t = 0
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [1,0,1,1], k = 1, t = 2
 * 输出：true
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出：false
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 2 * 104
 * <p>
 * -231 <= nums[i] <= 231 - 1
 * <p>
 * 0 <= k <= 104
 * <p>
 * 0 <= t <= 231 - 1
 *
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/contains-duplicate-iii">...</a>
 * <p>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k <= 0 || t < 0) return false;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long s = set.ceiling((long) nums[i] - t);
            if (s != null && s <= (long) nums[i] + t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

}
