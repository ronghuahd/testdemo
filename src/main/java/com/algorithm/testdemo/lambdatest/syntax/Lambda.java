package com.algorithm.testdemo.lambdatest.syntax;

import com.algorithm.testdemo.lambdatest.interfaces.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/22
 */
public class Lambda {

    public static void main(String[] args) {
        //Lambda表达式的基础语法
        //Lambda是一个匿名函数，
        //参数列表  方法体

        //()用来描述参数列表，
        // ｛｝用来描述方法体，
        // 中间用->来分隔 Lambda运算符，读作goes to

        //无参无返回值
        NoRNoP lambda1=()->{
            System.out.println("NoReturnNoParameter");
        };
        lambda1.test();

        //无返回值，单个参数
        NoReturnSingleParamter lambda2=(int a)->{
            System.out.println("这是"+a);
        };
        lambda2.test(2);

        //无返回值，多个参数
        NoReturnMutipleParameter lambda3=(int a,String b)->{
            System.out.println(b+"拥有"+a);
        };
        lambda3.test(20,"张三");

        //有返回值，无参
        SingleReturnNoParamter lambda4=()->{
            System.out.println("进入无参有返回值");
            return 100;
        };
        System.out.println(lambda4.test());

        //有返回值，单个参数
        SingleReturnSingleParamter lambda5=(int a)->{
            System.out.println("get"+a);
            return a;};
        System.out.println("有返回值，单个参数"+lambda5.test(99));

        //有返回值，多个参数
        SingleReturnMultipeParamter lambda6=(int a,int b)->{
            return a+b;
        };
        System.out.println("lambda6返回值"+lambda6.test(50,60));
    }



}
