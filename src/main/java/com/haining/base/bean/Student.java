package com.haining.base.bean;

/**
 * Created by haining on 15/7/27.
 */
public class Student {
    String name;
    String sex;
    Integer age;

    public Student(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getKKK(){
        return "dsa";
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
