package com.lee.book;

public class BookList {
    private Book[] books;

    private int usedSize;

    public BookList() {
        this.books = new Book[10];
        this.books[0] =new Book("三国演义","吴承恩",10,"小说");
        this.books[1] = new Book("西游记","罗贯中",10,"小说");
        this.books[2] = new Book("水浒传","施耐庵",10,"小说");
        this.books[3] = new Book("红楼梦","曹雪芹",10,"小说");
        this.usedSize = 3;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
