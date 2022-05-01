package com.itheima;

public class Student {
    private Integer id; //学生id
    private String sname; //学生姓名
    private int age;  //学生年龄
    private String classname; //所属班级

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student2020201318{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", classname='" + classname + '\'' +
                '}';
    }
}
