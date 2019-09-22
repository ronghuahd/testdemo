package com.algorithm.testdemo.lambdatest.data;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/22
 */
public class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println("Person无参方法执行");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参方法执行");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
