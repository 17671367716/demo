package com.example.rpc.rpc06.test;

import java.io.Serializable;

public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    Integer id ;
    String name;
    String school;
    Integer age;

    public Test() {
    }

    public Test(Integer id, String name, String school, Integer age) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", age=" + age +
                '}';
    }
}
