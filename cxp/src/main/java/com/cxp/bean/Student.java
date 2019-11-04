package com.cxp.bean;

import org.apache.ibatis.type.Alias;

@Alias("student")
public class Student {
    private int id;
    private String name;
    private String birthday;
    private int age;
    private String sex;

    public Student(int id, String name, String birthday, int age, String sex) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
