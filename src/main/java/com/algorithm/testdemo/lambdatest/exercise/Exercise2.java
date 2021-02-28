package com.algorithm.testdemo.lambdatest.exercise;

import com.algorithm.testdemo.lambdatest.data.Person;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/22
 */
public class Exercise2 {

    public static void main(String[] args) {
        testConstructor();
        testSortForTreeSet();
    }

    //测试treeSet的构造方法。主要目的是为了查看内部排序
    static void testConstructor() {
        TreeSet<String> a = new TreeSet<>();
        a.add("as");
        a.add("a");
        a.add("v");
        a.add("c");
        a.add("d");
        System.out.println(a);
    }

    //需求：已知在一个TreeSet中有若干个Person对象。将这些对象按照年龄进行降序排序
    //因为tree要求实现比较器，可以在treeSet构造的时候实现外部比较器，用Lambda的方式
    //下面就是从小到大排序
    static void testSortForTreeSet() {
        // 因为下面两个如果用o1.getAge()-o2.getAge()这样会被set去重，所有可以把比较规则去掉返回值为0的
        // 下面是第一种方式，会去重复
        // TreeSet<Person> set = new TreeSet<>((o1,o2)->o1.getAge()-o2.getAge());
        // 第二种方式，保留重复数据
        TreeSet<Person> set = new TreeSet<>((o1, o2) -> {
            if (o1.getAge() >= o2.getAge()) {
                return 1;
            } else return -1;
        });
        set.add(new Person("小王", 15));
        set.add(new Person("王叔", 35));
        set.add(new Person("莉莉", 13));
        set.add(new Person("double 丽丽", 13));
        set.add(new Person("路西", 22));
        set.add(new Person("路飞", 22));
        set.add(new Person("小龙", 21));
        set.add(new Person("王妈", 40));
        System.out.println("++++++++++++++++++=========");
        set.forEach(System.out::println);
    }
}
