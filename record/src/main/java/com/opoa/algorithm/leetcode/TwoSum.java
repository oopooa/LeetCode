/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 */

package com.opoa.algorithm.leetcode;

import java.util.HashMap;

/**
 * 001
 * @program: LeetCode->twoSum
 * @description: 两数之和
 * @author: opoa
 * @create: 2021-02-04 22:24
 **/
public class TwoSum {

    /**
     * 暴力法
     */
    public static int[] solution1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 哈希法
     */
    public static int[] solution2(int[] nums, int target) {
        HashMap<Integer, Integer> tempMap = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            if (tempMap.containsKey(target - nums[i])) {
                return new int[]{tempMap.get(target - nums[i]), i};
            }
            tempMap.put(nums[i], i);
        }
        return new int[0];
    }
}
