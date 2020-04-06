package com.lee.operation;

import com.lee.book.Book;
import com.lee.book.BookList;

import java.util.Scanner;

public class RemoveBook implements Work{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书名");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                break;
            }
        }
        if ( i == bookList.getUsedSize()) {
            System.out.println("没有这本书");
            return;
        }
        for (int j = i ;j < bookList.getUsedSize()-1; j++) {
            Book book = bookList.getBooks(j+1);
            bookList.setBooks(j,book);
        }
        int tmpSize = bookList.getUsedSize();
        bookList.setUsedSize(tmpSize -1);
    }
}
