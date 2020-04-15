package com.lee.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //1.实例化一个Map
        Map<String,String> map = new HashMap<>();

        //2.isEmpty / size
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        //3.put 插入键值对
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("豹子头","林冲");

        //4.get 查找键值对 键值对是通过Key 查找value 反之不行
        System.out.println("------------------");
        System.out.println(map.get("豹子头"));
        System.out.println(map.get("行者"));

        //5.getOrDefault 找到key 返回对应得value 没找到返回默认值defaultValue
        System.out.println("-------------------");
        System.out.println(map.getOrDefault("豹子头", "林冲"));
        System.out.println(map.getOrDefault("玉麒麟", "宋江"));
        System.out.println(map.getOrDefault("林冲","豹子头"));

        //6.使用contains判定元素是否存在
        System.out.println("-------------------");
        //比较高效
        System.out.println(map.containsKey("豹子头"));
        //比较低效
        System.out.println(map.containsValue("林冲"));

        //6.循环遍历Map
        //此处得Entry 表示条目（一个一个得键值对）
        //针对Map来说 保存得元素顺序和插入顺序无无关  对于元素顺序有自己的规则
        System.out.println("-------------------");
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //7.clear 清空元素
        System.out.println("-------------------");
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());
    }
}
