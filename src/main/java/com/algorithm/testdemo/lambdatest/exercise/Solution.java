package com.algorithm.testdemo.lambdatest.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        // int[][] envelopes=new int[][]{{4,5},{6,7}, {2,3}};
        // int[][] envelopes=new int[][]{{5,4},{6,4}, {6,7},{2,3}};
        // int[][] envelopes=new int[][]{{1,3},{3,5},{6,7},{6,8},{8,4},{9,5}};
        int[][] envelopes=new int[][]{{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},{6,370},{6,360},{7,380}};
        int result=0;
        int length=envelopes.length;
        if(length>0){
            // 第一轮循环先根据第一个数排序，将数据排序
            for(int i=0;i<length-1;i++){
                for(int j=0;j<length-i-1;j++){
                    // 第二个条件防止相同首位数导致第二位取大了
                    if(envelopes[j][0]>envelopes[j+1][0]
                    || (envelopes[j][0] == envelopes[j+1][0]
                            && envelopes[j][1]>envelopes[j+1][1])){
                        int[] temp= envelopes[j+1];
                        envelopes[j+1]=envelopes[j];
                        envelopes[j]=temp;
                    }
                }
            }

            for (int[] envelope : envelopes) {
                System.out.println(Arrays.toString(envelope));
            }
            //排序后对第二位数据进行计算，每个元素都重复一次
            result=1;
            for(int i=0;i<length-1;i++){
                int count=1;
                int[] temp=envelopes[i];
                for(int j= i+1 ; j<length;j++){
                    // 一样的时候就跳过进行下一组比较.
                    if(temp[0] == envelopes[j][0]){
                        continue;
                    }
                    // 满足条件就加1,并置换参数
                    if(envelopes[j][1] > temp [1]){
                        temp= envelopes[j];
                        count++;
                    }
                }
                if(count>result){
                    result=count;
                }
            }
        }
        System.out.println("result:"+result);
    }
}
