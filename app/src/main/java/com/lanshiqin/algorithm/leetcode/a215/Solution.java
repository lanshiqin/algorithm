package com.lanshiqin.algorithm.leetcode.a215;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最大元素
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * <p>
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * <p>
 * 提示：
 * <p>
 * 1 <= k <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public int solutionOne(int[] nums, int k) {
        int[] num = bubbleSort(nums);
        return num[nums.length - k];
    }

    public int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public int solutionTwo(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) queue.add(num);
        while(k-->1) queue.poll();
        return queue.peek();
    }

    public int solutionThree(int[] nums, int k){
        return quickSort(nums,0, nums.length -1, k);
    }

    public int quickSort(int[] nums, int left, int right, int k){
        int mid = getMid(nums,left,right);
        if(k==mid-left+1){
            return nums[mid];
        }else if(k<mid-left+1){
            return quickSort(nums, left, mid-1, k);
        }else{
            return quickSort(nums, mid+1, right,k-(mid-left+1));
        }
    }

    public int getMid(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (nums[right] <= pivot && left < right) right--;
            nums[left] = nums[right];
            while (nums[left] >= pivot && left < right) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}
