package com.lee.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        //Collection 是一个借口  它内部的方法都是抽象方法
        //这些方法在执行的时候，具体的行为取决于Collection对应的真实对象类型
        //基于多态实现

        //1.实例化一个Collection 对象。 Collection是一个接口，必须要new一个实例才可以
        Collection<String> collection = new ArrayList<>();

        //2.使用size(获取长度)/isEmpty(当内部有元素存在时 返回false 否则返回true)
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        //3.使用add添加元素
        collection.add("j");
        collection.add("a");
        collection.add("v");
        collection.add("a");

        //4.再次使用size/isEmpty
        System.out.println("---------------------");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        //5.toArray 把集合转换尾数组
        //String 也是继承自Object ,array 看似是Object数组 其实是String数组
        System.out.println("---------------------");
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(collection);

        //6.使用for each 遍历collection
        //  比较简单得遍历方式
        for (String s:collection) {
            System.out.println(s);
        }

        //7.判定元素是否存在 contains 内部会用参数的对象和集合中保存的对象按值比较（而不是按身份比较）
        System.out.println("---------------------");
        System.out.println(collection.contains("j"));
        System.out.println(collection.contains("a"));
        System.out.println(collection.contains("v"));
        System.out.println(collection.contains("a"));

        //8.使用删除方法 删除指定元素
        System.out.println("---------------------");
        collection.remove("j");
        for (String s:collection) {
            System.out.println(s);
        }

        //9.使用clear 清空元素
        System.out.println("---------------------");
        collection.clear();
        for (String s:collection) {
            System.out.println(s);
        }
        collection.size();
        collection.isEmpty();
    }
}
