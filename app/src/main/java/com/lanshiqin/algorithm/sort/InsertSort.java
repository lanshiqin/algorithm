package com.lanshiqin.algorithm.sort;

/**
 * 插入排序
 * 分为已排序和待排序
 *
 * @author shiqin.lan
 */
public class InsertSort {

    public void insertSort(int[] nums) {
        int n = nums.length;
        // 遍历未排序
        for (int i = 1; i < n; i++) {
            int value = nums[i];
            // 从后往前遍历已排序
            int j = i - 1;
            for (; j >= 0; j--) {
                // 比较未排序和已排序的元素
                if (value < nums[j]) {
                    // 移动元素
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            // 插入元素
            nums[j + 1] = value;
        }
    }

}
