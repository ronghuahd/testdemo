package com.algorithm.testdemo.lambdatest.exercise;

import com.algorithm.testdemo.lambdatest.data.Person;
import org.springframework.util.CollectionUtils;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA
 *
 * @Author: ronghua
 * @Date: 2019/9/22
 */
public class Exercise3 {

    public static void main(String[] args) {
        //需求：已知在一个ArrayList中有若干个Person对象。将这些对象按照年龄进行降序排序
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小王", 15));
        list.add(new Person("王叔", 35));
        list.add(new Person("莉莉", 13));
        list.add(new Person("路西", 22));
        list.add(new Person("小龙", 21));
        list.add(new Person("王妈", 40));
//        list.sort((o1, o2) -> o2.getAge() - o1.getAge());
//        list.forEach(elm->{
//            System.out.println(elm);
//        });
//        System.out.println("===============");
//        list.removeIf(elm->elm.getAge()>20);
//        System.out.println(list);
        int sum = list.stream().filter(o1 -> o1.getAge() > 20).mapToInt(Person::getAge).sum();
        System.out.println(sum);
    }
}
