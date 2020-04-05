package com.lee.operation;

import com.lee.book.BookList;

import java.util.Scanner;

public class ReturnBook implements Work {

    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要归还的书名");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                if (bookList.getBooks(i).isBorrowed()) {
                    bookList.getBooks(i).setBorrowed(false);
                    System.out.println("归还成功");
                    return;
                }else {
                    System.out.println("未被借阅");
                    return;
                }
            }
        }
    }
}
