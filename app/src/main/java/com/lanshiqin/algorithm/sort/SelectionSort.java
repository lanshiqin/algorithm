package com.lanshiqin.algorithm.sort;

/**
 * 选择排序
 *
 * @author shiqin.lan
 */
public class SelectionSort {

    public void selectionSort(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            int pos = findMaxPos(nums, n);
            int temp = nums[pos];
            nums[pos] = nums[n - 1];
            nums[n - 1] = temp;
            n--;
        }
    }

    private int findMaxPos(int[] nums, int n) {
        int max = nums[0];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                pos = i;
            }
        }
        return pos;
    }
}
