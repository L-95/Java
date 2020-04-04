package com.lee.user;

import com.lee.operation.*;

import java.util.Scanner;

public class NormaUser extends User{

    public NormaUser(String name) {
        super(name);
        //数组当中存放NormaUser对应的操作
        this.Works = new Work[]{
                new EscBookList(),
                new FindBook(),
                new BorrowBook(),
                new ReturnBook()

        };
    }

    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" hello  " + this.name +"  欢迎登录图书借阅系统");
        System.out.println("1,查找书籍");
        System.out.println("2,借阅书籍");
        System.out.println("3,归还书籍");
        System.out.println("0,退出系统");
        int chioce = scanner.nextInt();
        return chioce;
    }


}
