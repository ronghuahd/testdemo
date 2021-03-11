package com.algorithm.testdemo.lambdatest.exercise;

// 找出循环数组中比本元素大的第一个元素
public class NextBigNum {

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,3};
        nextGreaterElements(nums);
    }

    public static int[] nextGreaterElements(int[] nums) {

        return firstSolution(nums);
    }


    // 最简单的逻辑，遍历寻找
    static int[] firstSolution(int[] nums) {
        int[] result;
        int length = nums.length;
        result = new int[length];
        for (int i = 0; i < result.length; i++) {
            // 先假设没有比他大的，设为-1
            boolean get = false;
            result[i]=-1;
            //先循环后面的数据
            for (int j = i + 1; j < length; j++) {
                // 找出第一个比元素大的数
                if (nums[j] > nums[i]) {
                    result[i] = nums[j];
                    get = true;
                    break;
                }
            }
            if (get) {
                continue;
            }
            //再循环前面的数据
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    result[i] = nums[j];
                    break;
                }
            }
        }
        return result;
    }
}
