package com.lanshiqin.algorithm.sort;

/**
 * 插入排序
 * 将数据分为已排序区间和未排序区间两个部分。
 * 从未排序的数据中逐个取出元素与已排序的数据逐个比较查找插入的位置。
 * 不满足条件时逐个移动数据，满足条件时结束移动插入数据
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
