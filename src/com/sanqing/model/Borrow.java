package com.sanqing.model;

import java.util.Date;

public class Borrow {    //书籍借阅信息类
    private int id;//借阅编号
    private String bookISBN;//书籍编号
    private String readerISBN;//读者编号
    private String num;//借书数量
    private String borrowDate;//借书日期
    private String backDate;//应还日期
    private String bookName;//书籍名称

    public Borrow(int id, String bookISBN, String readerISBN, String num, String borrowDate, String backDate, String bookName) {
        this.id = id;
        this.bookISBN = bookISBN;
        this.readerISBN = readerISBN;
        this.num = num;
        this.borrowDate = borrowDate;
        this.backDate = backDate;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getReaderISBN() {
        return readerISBN;
    }

    public void setReaderISBN(String readerISBN) {
        this.readerISBN = readerISBN;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBackDate() {
        return backDate;
    }

    public void setBackDate(String backDate) {
        this.backDate = backDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
