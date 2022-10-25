package com.lanshiqin.algorithm.sort;

/**
 * 桶排序
 * 将数据按照一定范围均匀分布到桶里，每个桶内部再使用快排。
 * 当桶当个数接近元素个数时，时间复杂度位O（n）
 * 顺序访问每个桶，所有元素就是排好序的。
 *
 * @author shiqin.lan
 */
public class BucketSort {

    public void bucketSort(int[] nums) {
        // 找最大值，定义出桶范围
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        // 遍历数据分桶存放
        Integer[] bucket = new Integer[max + 1];
        for (int num : nums) {
            bucket[num] = num;
        }
        // 按顺序遍历桶得到有序数据
        int i = 0;
        for (Integer integer : bucket) {
            if (integer != null) {
                nums[i++] = integer;
            }
        }

    }
}
