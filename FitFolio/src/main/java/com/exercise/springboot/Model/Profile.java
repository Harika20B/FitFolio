package com.exercise.springboot.Model;

public class Profile {
    private String name;
    private int age;
    private long contact;

    public Profile(String name, int age, long contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}

