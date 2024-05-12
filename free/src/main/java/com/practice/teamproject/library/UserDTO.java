package com.practice.teamproject.library;

public class UserDTO {

    private String name;
    private int age;
    private String phone;

    public UserDTO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n"+name;
    }
}

