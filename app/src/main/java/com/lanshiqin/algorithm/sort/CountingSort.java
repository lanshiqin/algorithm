package com.lanshiqin.algorithm.sort;

/**
 * 计数排序
 * 桶排序对特殊情况，每个桶内存放的时相同元素值的计数
 * 对待排序对数据范围有要求。时间复杂度O(n)
 *
 * @author shiqin.lan
 */
public class CountingSort {

    public void countSort(int[] nums) {
        int n = nums.length;
        if (n <= 1) return;
        // 1. 遍历数据，得到值范围
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        // 2. 初始化计数桶
        int[] c = new int[max + 1];
        // 3. 边遍历边计数
        for (int num : nums) {
            c[num]++;
        }
        // 4. 计数桶顺序累加
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
            c[i] = sum;
        }
        // 5. 倒序遍历待排序数组，将排序的数据放入临时数组
        int[] r = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int index = --c[nums[i]];
            r[index] = nums[i];
        }
        // 6. 拷贝到原数组
        for (int i = 0; i < n; i++) {
            nums[i] = r[i];
        }
    }
}
