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
            boolean flags = false;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flags = true;
                }
            }
            if (!flags) {
                break;
            }
        }
    }

}
