package com.algorithm.testdemo.lambdatest.syntax;

import com.algorithm.testdemo.lambdatest.interfaces.NoReturnMutipleParameter;
import com.algorithm.testdemo.lambdatest.interfaces.NoReturnSingleParamter;
import com.algorithm.testdemo.lambdatest.interfaces.SingleReturnMultipeParamter;
import com.algorithm.testdemo.lambdatest.interfaces.SingleReturnSingleParamter;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/22
 */
public class Lambda2 {



    public static void main(String[] args) {
        //语法精简之参数精简
        //1.由于在接口的抽象方法中已经定义了参数的数量和类型，所有Lambda表达式，参数饿类型可以省略
        //如果需要省略类型，则每一个参数的类型都要省略
        NoReturnMutipleParameter lambda1 = (a, b) -> {
            System.out.println(b + "拥有" + a);
        };
        lambda1.test(100, "zhang");

        //2.参数小括号，在只有一个参数的时候，小括号可以省略
        NoReturnSingleParamter lambda2 = a1 -> {
            System.out.println("hello"+a1);
        };
        lambda2.test(5);

        //3.方法大括号，如果方法体中只有一条语句，此时大括号可以省略
        NoReturnMutipleParameter lambda3=(a,b)-> System.out.println(a+b);
        lambda3.test(2,"6");


        //4.如果方法体中唯一一个语句是返回语句，那么省略大括号的同事，也必须省略return
        SingleReturnSingleParamter lambda4=a -> a+15;
        System.out.println(lambda4.test(6));

        //5.练习
        SingleReturnMultipeParamter lambda5=(a,b)->a+b;
        System.out.println(lambda5.test(12,96));
    }


}
