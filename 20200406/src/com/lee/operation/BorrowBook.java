package com.lee.operation;

import com.lee.book.BookList;

import java.util.Scanner;

public class BorrowBook implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要借阅的书名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                bookList.getBooks(i).setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }else if (bookList.getBooks(i).isBorrowed()){
                System.out.println("已经被借阅");
                return;
            }
        }
        System.out.println("没有这本书");
    }
}
