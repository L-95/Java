package com.lee.operation;

import com.lee.book.BookList;

import java.util.Scanner;

public class FindBook implements Work{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要查找的书名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize();i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                System.out.println(bookList.getBooks(i));
                System.out.println("找到了这本书");
                return;
            }
        }
    }
}
