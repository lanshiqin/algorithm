package com.lanshiqin.algorithm.leetcode.a74;

/**
 * 74. 搜索二维矩阵
 * <p>
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 * <p>
 * 提示：
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode-cn.com/problems/search-a-2d-matrix">https://leetcode-cn.com/problems/search-a-2d-matrix</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int col = matrix[0].length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int value = matrix[mid][col];
            if (value == target) {
                return true;
            } else if (value > target) {
                if (matrix[mid][0] <= target) {
                    left = mid;
                    break;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int row = left;
        left = 0;
        right = matrix[0].length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = matrix[row][mid];
            if (value == target) {
                return true;
            } else if (value > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
