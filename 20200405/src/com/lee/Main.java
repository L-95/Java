package com.lee;

import com.lee.book.BookList;
import com.lee.user.AdminUser;
import com.lee.user.NormaUser;
import com.lee.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();

        //登录
        User user = login();

        while(true) {
            //选择
            int choice = user.menu();
            //根据选择 确定调用哪个操作方法
            user.doWork(choice, bookList);
        }
    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.nextLine();
        while(true) {
            System.out.println("请输入你的身份: 1->管理员；2->用户");
            int num = scanner.nextInt();
            if (num == 1) {
                return new AdminUser(name);
            } else if (num == 2) {
                return new NormaUser(name);
            } else {
                System.out.println("您的输入有误,请重新输入！");
            }
        }
    }
}
