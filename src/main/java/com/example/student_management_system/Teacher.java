package com.example.student_management_system;

public class Teacher {
    private int teacher_id;
    private String name;
    private int age;

    private String course;
    private int exp;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Teacher() {
    }

    public Teacher(int teacher_id, String name, int age, String course, int exp) {
        this.teacher_id = teacher_id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.exp = exp;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
