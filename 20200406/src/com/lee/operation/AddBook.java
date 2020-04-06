package com.lee.operation;

import com.lee.book.Book;
import com.lee.book.BookList;

import java.util.Scanner;

public class AddBook implements Work{

    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.nextLine();
        System.out.println("请输入作者");
        String author = scanner.nextLine();
        System.out.println("请输入价格");
        int price = scanner.nextInt();
        System.out.println("请输入类型");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);
        int curSizee = bookList.getUsedSize();
        bookList.setBooks(curSizee,book);
        bookList.setUsedSize(curSizee+1);
    }
}
