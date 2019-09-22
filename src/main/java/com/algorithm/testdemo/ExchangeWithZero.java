package com.algorithm.testdemo;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/15
 */
public class ExchangeWithZero {

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 8, 6, 1, 2, 4, 0};
        //int[] arr={0};
        long startTime=System.currentTimeMillis();
        sort(arr, arr.length);
        long endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println(endTime+"毫秒"+startTime);
    }


    private static void sort(int[] arr,int len){
        for (int i=0;i<len;i++){
            if (arr[i]==i){
                continue;//相等就已经排好序了，不需要在交换
            }
            getZeroChange(arr,len,arr[i]);//把i位置上的数据和0进行交换
            getZeroChange(arr,len,i);//找出数字i，让其和0交换
        }
    }

    private static void getZeroChange(int[] arr,int len,int n){
        int zeroIndex=-1;
        int nIndex=-1;
        //找出0和n元素对应的下标，进行交换
        for(int i=0;i<len;i++){
            if(arr[i]==n){
                nIndex=i;
            }
            if(arr[i]==0){
                zeroIndex=i;
            }
        }
        int temp=arr[nIndex];
        arr[nIndex]=arr[zeroIndex];
        arr[zeroIndex]=temp;
    }


    /**
     * 提供交换的方法
     * @param arr
     * @param len
     * @param n
     */
    private static void swapWithZero(int[] arr, int len, int n) {
        int zIndex = -1;
        int nIndex = -1;
        //循环遍历找到0和数字n所在的位置
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                zIndex = i;
            }
            if (arr[i] == n) {
                nIndex = i;
            }
        }
        //交换位置
        int tmp = arr[zIndex];
        arr[zIndex] = arr[nIndex];
        arr[nIndex] = tmp;
    }
}
