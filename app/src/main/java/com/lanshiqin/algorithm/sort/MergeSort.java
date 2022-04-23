package com.lanshiqin.algorithm.sort;

/**
 * 归并排序
 *
 * @author shiqin.lan
 * 分治，二分法不断拆分，直到拆分的元素就剩1个时，做合并，合并的时候进行比较大小。
 */
public class MergeSort {

    public void mergeSort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    public void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int s1 = left;
        int s2 = mid + 1;
        int[] temp = new int[nums.length];
        int i = 0;
        while (s1 <= mid && s2 <= right) {
            if (nums[s1] < nums[s2]) {
                temp[i++] = nums[s1++];
            } else {
                temp[i++] = nums[s2++];
            }
        }
        while (s1 <= mid) {
            temp[i++] = nums[s1++];
        }
        while (s2 <= right) {
            temp[i++] = nums[s2++];
        }
        i = 0;
        while (left <= right) {
            nums[left++] = temp[i++];
        }
    }
}
