package com.algorithm.testdemo.algorithm;

import com.sun.deploy.util.ArrayUtil;
import jdk.nashorn.internal.ir.LiteralNode;
import org.thymeleaf.util.ArrayUtils;

import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;

//排序算法
public class SortAlgorithm {

    public static void main(String[] args) {
        int[] array = {37, 47, 23, 101, 100, 19, 20, 19, 200, 3, 88, 88};
        System.out.println("冒泡结果：" + Arrays.toString(bubbleSort(array)));
        System.out.println("选择结果：" + Arrays.toString(chooseSort(array)));
        System.out.println("插入结果：" + Arrays.toString(insertSort(array)));
        System.out.println("希尔结果：" + Arrays.toString(shellSort(array)));
        System.out.println("快速排序结果：" + Arrays.toString(fastSort(array)));
    }

    // 快速排序 有个中间值pivot，自己确定，一般取排列第一个
    // 递归
    public static int[] fastSort(int[] array) {
        int[] result = retNewArray(array);
        fastSort_Real(result, 0, result.length - 1);
        return result;
    }

    // 快速排序。pivot选第一个值，左右下标输入
    private static void fastSort_Real(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        // 记录边界值
        int l = left;
        int r = right;
        int pivot = array[left];
        // 标志位，判断左右游标
        while (left < right) {
            while (left < right && array[right] >= pivot) {
                right = right - 1;
            }
            array[left] = array[right];
            while (left < right && array[left] <= pivot) {
                left = left + 1;
            }
            array[right] = array[left];
        }
        array[left] = pivot;
        // 递归继续两边
        fastSort_Real(array, l, left - 1);
        fastSort_Real(array, left + 1, r);
    }


    // 希尔排序，分割再对子列进行插入排序
    // 将待排序数组按照步长gap进行分组，
    // 然后将每组的元素利用直接插入排序的方法进行排序；
    // 每次再将gap折半减小，循环上述操作；当gap=1时，利用直接插入，完成排序
    // https://www.cnblogs.com/onepixel/articles/7674659.html
    public static int[] shellSort(int[] array) {
        int[] result = retNewArray(array);
        // 这个gap自己取，不同的取法
        int length = result.length;
        for (int gap = length / 2; gap > 0; gap = gap / 2) {
            for (int i = 0; i < length - gap; i = i + gap) {
                //插入往前扫描,满足条件就互换插入
                for (int j = i + gap; j > 0; j = j - gap) {
                    if (result[j] < result[j - gap]) {
                        int temp = result[j];
                        result[j] = result[j - gap];
                        result[j - gap] = temp;
                    }
                }
            }
        }
        return result;
    }


    //冒泡排序
    public static int[] bubbleSort(int[] arrays) {
        int[] result = retNewArray(arrays);
        for (int i = 0; i < result.length - 1; i++) {
            int temp;
            for (int j = 0; j < result.length - 1; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    //选择排序：每次位排序中最小的，然后再和当前交换
    public static int[] chooseSort(int[] arrays) {
        int[] result = retNewArray(arrays);
        int length = result.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = result[i];
                result[i] = result[minIndex];
                result[minIndex] = temp;
            }
        }
        return result;
    }

    //插入排序, 对已排序的进行扫描，将大于需要排序的往后移动
    public static int[] insertSort(int[] arrays) {
        int[] result = retNewArray(arrays);
        int length = result.length;
        // 假设0位已经排序
        for (int i = 1; i < length; i++) {
            //下面是需要插入的数据
            int num = result[i];
            int j;
            // 对已排序的从后往前扫描
            for (j = i; j > 0 && num < result[j - 1]; j--) {
                // 如果比对应位小就将对应位往后移动一位
                result[j] = result[j - 1];
            }
            // 这里因为上面循环最后进行了j--操作，因此j位改变
            result[j] = num;
        }
        return result;
    }


    // 复制数组，达到可以多组测试目的
    static int[] retNewArray(int[] arrays) {
        int[] result = new int[arrays.length];
        //复制一遍数组的值
        System.arraycopy(arrays, 0, result, 0, arrays.length);
        // System.out.println("bbb"+Arrays.toString(arrays));
        return result;
    }
}
