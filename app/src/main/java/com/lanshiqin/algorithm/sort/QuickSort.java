package com.lanshiqin.algorithm.sort;

/**
 * 快速排序
 *
 * @author shiqin.lan
 * 1. 选取 pivot，定义 left 和 right 指针
 * right从右往左扫，小于pivot的放左边。
 * left从左往右扫，大于pivot的放在右边。
 * 2. 递归pivot左边快排
 * 3. 递归pivot右边快排
 */
public class QuickSort {

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = getMid(nums, left, right);
            quickSort(nums, left, mid);
            quickSort(nums, mid + 1, right);
        }
    }

    public int getMid(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (nums[right] > pivot && left < right) right--;
            nums[left] = nums[right];
            while (nums[left] < pivot && left < right) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}
