package com.algorithm.testdemo.algorithm;

//杨辉三角实现
public class YangHui {

    public static void main(String[] args) {
        firstMethod(10);
        System.out.println("\n\n\n");
        secondMethod(10);
    }

    //靠左的杨辉三角, 在斜线左下角区域
    // n 行数
    static void firstMethod(int n) {
        int[][] arr = generateArr(n);
        //打印
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }


    //杨辉三角(等腰三角形）
    // n 行数
    static void secondMethod(int n) {
        int[][] arr = generateArr(n);
        //打印等腰三角
        for (int i = 0; i < arr.length; i++) {
            int num = arr.length - i;
            for (int k = 0; k < num; k++) {
                //这里考虑灵活制表数
                System.out.print("\t");
            }
            for (int j = 0; j <arr[i].length;j++) {
                if(arr[i][j]!=0){
                    System.out.print(arr[i][j] + "\t\t");
                }
            }
            System.out.println();
        }
    }

    private static int[][] generateArr(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        return arr;
    }
}
