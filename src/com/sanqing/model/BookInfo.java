package com.sanqing.model;

import java.util.Date;

public class BookInfo {
    private String ISBN;//图书编号
    private String typeid;//类别编号
    private String writer;//作者
    private String translator;//译者
    private String publisher;//出版社
    private Date data;//出版日期
    private Double price;//书籍价格
    private String bookname;//书籍名称

    public BookInfo(String ISBN, String typeid, String writer, String translator, String publisher, Date data, Double price, String bookname) {
        this.ISBN = ISBN;
        this.typeid = typeid;
        this.writer = writer;
        this.translator = translator;
        this.publisher = publisher;
        this.data = data;
        this.price = price;
        this.bookname = bookname;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
