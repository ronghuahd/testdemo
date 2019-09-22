package com.algorithm.testdemo.lambdatest.syntax;

import com.algorithm.testdemo.lambdatest.data.Person;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/22
 */
public class Lambda4 {
    public static void main(String[] args) {
        //常见用法
        PersonCreater personCreater = () -> new Person();

        //构造方法的引用
        //new引用的是有参还是无参构造方法取决于接口中方法参数类型
        PersonCreater creater1=Person::new;
        Person person = creater1.getPerson();

        PersonCreater2 creater2=Person::new;
        Person person1 = creater2.getPerson("zhang",15);
    }

}

//需求：
interface PersonCreater {
    Person getPerson();
}

//需求：
interface PersonCreater2 {
    Person getPerson(String name,int age);
}

