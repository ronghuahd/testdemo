package com.algorithm.testdemo.lambdatest.exercise;

import java.util.Arrays;

public class NumArray {
    /*给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
    实现 NumArray 类：
    NumArray(int[] nums) 使用数组 nums 初始化对象
    int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，
    包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/range-sum-query-immutable
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

    // 多研究下下这个算法。用空间换时间，多多理解前缀和
    // 用于存储前面所有数之和
    static int[] preSums;

    public static void main(String[] args) {
        int[] nums=new int[]{-2, 0, 3, -5, 2, -1};
        sumNum(nums);
        System.out.println(Arrays.toString(preSums));
        System.out.println(sumRange(0,2));
    }

    public static void sumNum(int[] nums) {
        int n = nums.length;
        // 初始化 ,n+1 防止溢出
        preSums = new int[n+1];
        // 计算前缀和，放入sums中
        for(int i=0; i<n; i++){
            preSums[i+1] = preSums[i] + nums[i];
        }
    }

    // 调用减法直接用sums计算答案
    public static int sumRange(int i, int j) {
        return preSums[j+1] - preSums[i];
    }

}
