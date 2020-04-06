package com.lee.operation;

import com.lee.book.BookList;

public class PrintBookList implements Work {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBooks(i));
        }
    }

}
