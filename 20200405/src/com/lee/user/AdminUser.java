package com.lee.user;

import com.lee.operation.*;

import java.util.Scanner;

public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);

        //数组当中存放AdminUser对应的操作
        this.Works = new Work[]{
                new EscBookList(),
                new FindBook(),
                new AddBook(),
                new RemoveBook(),
                new PrintBookList()
        };
    }

    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" hello  " + this.name +"  欢迎登录图书管理系统");
        System.out.println("1,查找书籍");
        System.out.println("2,新增书籍");
        System.out.println("3,删除书籍");
        System.out.println("4,打印书籍");
        System.out.println("0,退出系统");
        int chioce = scanner.nextInt();
        return chioce;
    }
}
