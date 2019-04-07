package com.sanqing.model;

import java.util.Date;

public class Order {  //书籍订单信息类
    private String ISBN;//图书编号
    private Date data;//下单时间
    private String number;//图书数量
    private String operator;//操作员
    private String checkAndAccept;//是否验收
    private String zk;//书籍折扣

    public Order(String ISBN, Date data, String number, String operator, String checkAndAccept, String zk) {
        this.ISBN = ISBN;
        this.data = data;
        this.number = number;
        this.operator = operator;
        this.checkAndAccept = checkAndAccept;
        this.zk = zk;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCheckAndAccept() {
        return checkAndAccept;
    }

    public void setCheckAndAccept(String checkAndAccept) {
        this.checkAndAccept = checkAndAccept;
    }

    public String getZk() {
        return zk;
    }

    public void setZk(String zk) {
        this.zk = zk;
    }
}
