package com.example.spring.demo.entity;

public class user {
    private String name;
    private int id;

    public user(){}
    public user(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
}
