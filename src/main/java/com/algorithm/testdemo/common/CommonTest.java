package com.algorithm.testdemo.common;

public class CommonTest {

    public static void main(String[] args) {
        String str=" abcdc,中文gxd da ";
        String a="a";
        int length = str.length();//得到字符串长度，长度16
        byte[] bytes = str.getBytes();//字符串转换为字节数组,长度20
        char[] chars = str.toCharArray();//字符串转换为字符数组，长度16
        String[] split = str.split(",");//按字符串按指定字符内容劈开，数组长度2

        /*判断*/
        boolean equals = str.equals(a);//判断两个字符串的内容是否一模一样，false
        boolean b = str.equalsIgnoreCase(a);//忽略大小判断是否一样，false
        boolean contains = str.contains(a);//是否包含a。true
        boolean b1 = str.startsWith(a);//是否以a开头true
        boolean b2 = str.endsWith(a);//是否以a结尾true

        /*改变，但是不改变原string，都有返回值*/
        String upperCase = str.toUpperCase();//返回全大写，字母有效
        String lowerCase = str.toLowerCase();//返回全小写，字母有效
        String replace = str.replace("a", "zz");//将某个内容全部替换成指定内容
        String replaceAll = str.replaceAll("a", "z");//将某个内容全部替换成指定内容，支持正则
        String replaceFirst = str.replaceFirst("a", "z");//将第一次出现的某个内容替换成指定的内容
        String substring = str.substring(3);//从指定下标开始一直截取到字符串的最后
        String substr = str.substring(3,5);//从指定下标开始一直截取到字符串的最后,输出：cd
        String trim = str.trim();//去掉前后空格；输出:abcdc,中文gxd da

        /*定位*/
        char c = str.charAt(2);//得到指定下标位置对应的字符，返回b，
        int indexOf = str.indexOf(a);//返回第一个为a的坐标位置；返回1；没找到就返回-1
        int lastIndexOf = str.lastIndexOf("zzz");//返回最后一个为a的坐标，返回14；没找到返回-1；
    }
}
