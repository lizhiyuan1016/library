package com.sanqing.model;
public class Operator {
    private String id;//操作员编号
    private String name;//操作员用户名
    private String grade;//操作员等级
    private String password;//操作员密码

    public Operator(String id, String name, String grade, String password) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
