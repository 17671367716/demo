package com.example.rpc.demo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
