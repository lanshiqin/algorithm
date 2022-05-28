package com.lanshiqin.algorithm.leetcode.a480;

import java.util.*;

/**
 * 480. 滑动窗口中位数
 * <p>
 * 中位数是有序序列最中间的那个数。如果序列的长度是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。
 * <p>
 * 例如：
 * <p>
 * [2,3,4]，中位数是 3
 * [2,3]，中位数是 (2 + 3) / 2 = 2.5
 * 给你一个数组 nums，有一个长度为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口向右移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。
 * <p>
 * <p>
 * 示例：
 * <p>
 * 给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。
 * <p>
 * 窗口位置                      中位数
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       1
 * 1 [3  -1  -3] 5  3  6  7      -1
 * 1  3 [-1  -3  5] 3  6  7      -1
 * 1  3  -1 [-3  5  3] 6  7       3
 * 1  3  -1  -3 [5  3  6] 7       5
 * 1  3  -1  -3  5 [3  6  7]      6
 * 因此，返回该滑动窗口的中位数数组 [1,-1,-1,3,5,6]。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 你可以假设 k 始终有效，即：k 始终小于等于输入的非空数组的元素个数。
 * 与真实值误差在 10 ^ -5 以内的答案将被视作正确答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/sliding-window-median">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    // small堆，存放比较小的n个数，根最大，大根堆
    PriorityQueue<Double> small = new PriorityQueue<>((v1, v2) -> (int) (v2 - v1));
    // big堆，存放比较大的n个数，根最小，小根堆
    PriorityQueue<Double> big = new PriorityQueue<>();

    private double getMid(int k) {
        // 如果k是偶数，中位数为(small.peek()+big.peek())*0.5
        if (k % 2 == 0) {
            return (small.peek() + big.peek()) * 0.5;
        }
        // 如果k是基数，中位数在small堆里。
        return small.peek();
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        // 存放结果
        double[] result = new double[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            // 先往small堆存入k个数
            small.offer((double)nums[i]);
        }
        for (int i = 0; i < k / 2; i++) {
            // 把small堆的一半给big堆
            big.offer(small.poll());
        }
        result[0] = getMid(k);
        Map<Double, Integer> map = new HashMap<>();
        for (int i = k; i < nums.length; i++) {
            int balance = 0;
            // 记录滑动窗口即将删除的元素
            double left = nums[i - k];
            if (map.containsKey(left)) {
                map.put(left, map.get(left) + 1);
            } else {
                map.put(left, 1);
            }
            if (!small.isEmpty() && left <= small.peek()) {
                // 如果要删除元素在small堆里 平衡--
                balance--;
            } else {
                // 否则要删除元素在big堆里 平衡++
                balance++;
            }
            if (!small.isEmpty() && nums[i] <= small.peek()) {
                small.offer((double)nums[i]);
                balance++;
            } else {
                big.offer((double)nums[i]);
                balance--;
            }
            if (balance > 0) {
                big.offer(small.poll());
            }
            if (balance < 0) {
                small.offer(big.poll());
            }
            while (!small.isEmpty() && map.containsKey(small.peek())) {
                int value = map.get(small.peek());
                if (value > 0) {
                    map.put(small.peek(), --value);
                    small.poll();
                } else {
                    break;
                }
            }
            while (!big.isEmpty() && map.containsKey(big.peek())) {
                int value = map.get(big.peek());
                if (value > 0) {
                    map.put(big.peek(), --value);
                    big.poll();
                } else {
                    break;
                }
            }
            result[i - k + 1] = getMid(k);
        }

        return result;
    }
}
