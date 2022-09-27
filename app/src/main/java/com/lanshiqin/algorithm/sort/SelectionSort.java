package com.lanshiqin.algorithm.sort;

/**
 * 选择排序
 * 分为已排序区间和未排序区间，已排序区间初始值为0
 * 和插入排序的主要区别是每次都从未排序区间查找最小的一个元素插入到已排序区间的末尾
 * 选择排序的最好、最坏、平均情况时间复杂度都为 O（n^2）
 *
 * @author shiqin.lan
 */
public class SelectionSort {

    public void selectionSort(int[] nums) {
        int n = nums.length;
        // 遍历已排序
        for (int i = 0; i < n; i++) {
            // 遍历未排序
            int min = Integer.MAX_VALUE;
            int tmp = 0;
            for (int j = i; j < n; j++) {
                // 找到未排序中最小的元素
                if (nums[j] < min) {
                    min = nums[j];
                    tmp = j;
                }
            }
            // 插入已排序区间的末尾，需交换原末尾元素。
            nums[tmp] = nums[i];
            nums[i] = min;
        }
    }
}
