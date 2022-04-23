package com.lanshiqin.algorithm.sort;

/**
 * 冒泡排序
 *
 * @author shiqin.lan
 * 两两比较，每一趟排序都能找到第n-i大的元素
 * 最好时间复杂度O（n），最坏时间复杂度O（n^2）,平均时间复杂度O（n^2）
 */
public class BubbleSort {

    public void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = n; i >= 1; i--) {
            bubble(nums, i);
        }
    }

    private void bubble(int[] nums, int n){
        int tmp;
        for (int i = 0; i < n - 1; i++) {
            if(nums[i]>nums[i+1]){
                tmp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
