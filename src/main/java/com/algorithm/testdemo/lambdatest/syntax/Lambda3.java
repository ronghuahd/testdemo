package com.algorithm.testdemo.lambdatest.syntax;

import com.algorithm.testdemo.lambdatest.interfaces.SingleReturnSingleParamter;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/22
 */
public class Lambda3 {

    public static void main(String[] args) {
        //方法引用
        //可以快速的将一个Lambda表达式的实现指向一个已经实现的方法change()
        //语法：方法的隶属名::方法名
        //原始常规用法
        SingleReturnSingleParamter lambda=a -> change(a);
        System.out.println("原始引用"+lambda.test(20));

        //方法引用
        //这里change方法是静态方法，用类引用
        //注意：1.参数数量和类型一定要和接口中定义的保持一致
        //  2.返回值的类型也一定要和接口中定义的方法一致
        SingleReturnSingleParamter lambda2=Lambda3::change;
        System.out.println("方法引用:"+lambda2.test(30));

        Lambda3 thislambda=new Lambda3();
        SingleReturnSingleParamter lambda3=thislambda::change2;
        System.out.println("对象引用"+lambda3.test(50));
    }

    private static int change(int a){
        return a*2;
    }

    private int change2(int a){
        return a*2;
    }

}
