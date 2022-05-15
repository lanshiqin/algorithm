package com.lanshiqin.algorithm.leetcode.a219;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. 存在重复元素 II
 * <p>
 * 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * 示例1：
 * <p>
 * 输入：nums = [1,2,3,1], k = 3
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [1,0,1,1], k = 1
 * 输出：true
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：nums = [1,2,3,1,2,3], k = 2
 * 输出：false
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * 0 <= k <= 105
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/contains-duplicate-ii">https://leetcode.cn/problems/contains-duplicate-ii</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k <= 0) return false;
        int n = nums.length;
        int left = 0;
        int right = 0;
        Set<Integer> set = new HashSet<>();
        while (right < n) {
            int rightVal = nums[right];
            if (set.contains(rightVal)) return true;
            set.add(rightVal);
            if (right - left >= k) {
                set.remove(nums[left++]);
            }
            right++;
        }
        return false;
    }
}
