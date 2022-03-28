package com.lanshiqin.algorithm.sort;

/**
 * 插入排序
 *
 * @author shiqin.lan
 */
public class InsertSort {

    public void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            insert(nums, i);
        }
    }

    private void insert(int[] nums, int n){
        int key = nums[n];
        int i = n;
        while(nums[i-1]>key){
            nums[i] = nums[i-1];
            i--;
            if(i==0) break;
        }
        nums[i] = key;
    }
}
