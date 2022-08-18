package com.example.demo_student;

public class Student {
    private int id;

    private String name;

    private String birthday;

    private int age;

    public Student(int id, String name, String birthday, int age) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
