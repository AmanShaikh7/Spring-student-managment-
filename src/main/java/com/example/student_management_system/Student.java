package com.example.student_management_system;

public class Student {
    private int admiNo; // primary key
    private String name;
    private int age;
    private String course;

    public Student() {
    }

    public Student(int admiNo, String name, int age, String course) {
        this.admiNo = admiNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAdmiNo() {
        return admiNo;
    }

    public void setAdmiNo(int admiNo) {
        this.admiNo = admiNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
