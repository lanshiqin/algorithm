package com.lanshiqin.algorithm.sort;

/**
 * 快速排序
 * <p>
 * 从上往下，先分区，然后再处理子问题。
 * 分区点pivot很关键，决定了快排的时间复杂度。
 * 最好和平均情况时间复杂度为O(nlogn),最坏情况时间复杂度O(n^2)
 * <p>
 * 快排 [p..r] 步骤
 * 1. 当p<r时，遍历执行，选取分区点pivot，可以是数组的最后一个元素。
 * 2. 定义基准索引i和游标索引j，初始位置都为p，遍历对比j与pivot所在元素的大小
 * 当j元素<pivot元素时，swap（i,j), 然后i++；j++。 否则执行j++。遍历完成时swap（i，pivot)。
 * 第2步采用i索引维护p..i之间的元素小于pivot，i+1..r之间元素大雨pivot。
 * 快排为了达到原地排序所以不引入额外内存空间，使用尾插法到i位置进行swap节省内存消耗。
 *
 * @author shiqin.lan
 */
public class QuickSort {

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] nums, int p, int r) {
        if (p < r) {
            int pivot = partition(nums, p, r);
            quickSort(nums, p, pivot - 1);
            quickSort(nums, pivot + 1, r);
        }
    }

    public int partition(int[] nums, int p, int r) {
        int pivot = nums[r];
        int i = p, j = p;
        while (j < r) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        swap(nums, i, r);
        return i;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
