package com.sanqing.model;

public class Back {   //图书归还信息类
    private String bookISBN;//图书编号
    private String bookname;//图书名称
    private String operatorId;//操作员编号
    private String borrowData;//图书借阅时间
    private String bookData;//图书归还时间
    private String readerName;//读者姓名
    private String readerISBN;//读者编号

    public Back(String bookISBN, String bookname, String operatorId, String borrowData, String bookData, String readerName, String readerISBN) {
        this.bookISBN = bookISBN;
        this.bookname = bookname;
        this.operatorId = operatorId;
        this.borrowData = borrowData;
        this.bookData = bookData;
        this.readerName = readerName;
        this.readerISBN = readerISBN;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getBorrowData() {
        return borrowData;
    }

    public void setBorrowData(String borrowData) {
        this.borrowData = borrowData;
    }

    public String getBookData() {
        return bookData;
    }

    public void setBookData(String bookData) {
        this.bookData = bookData;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderISBN() {
        return readerISBN;
    }

    public void setReaderISBN(String readerISBN) {
        this.readerISBN = readerISBN;
    }
}
