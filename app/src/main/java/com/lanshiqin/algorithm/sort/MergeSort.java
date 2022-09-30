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

    private void mergeSort(int[] nums, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(nums, p, q);
            mergeSort(nums, q + 1, r);
            merge(nums, p, q, r);
        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[nums.length];
        int s1 = left;
        int s2 = mid + 1;
        int i = 0;
        while (s1 <= mid && s2 <= right) {
            if (nums[s1] < nums[s2]) {
                tmp[i++] = nums[s1++];
            } else {
                tmp[i++] = nums[s2++];
            }
        }
        while (s1 <= mid) {
            tmp[i++] = nums[s1++];
        }
        while (s2 <= right) {
            tmp[i++] = nums[s2++];
        }
        i = 0;
        while (left <= right) {
            nums[left++] = tmp[i++];
        }
    }
}
