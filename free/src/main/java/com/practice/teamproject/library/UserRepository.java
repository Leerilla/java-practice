package com.practice.teamproject.library;

import java.util.ArrayList;

public class UserRepository {

    private ArrayList data = new ArrayList();

    public void addUser(UserDTO user) {
        data.add(user);
    }

    public void print() {
        for (Object user : data) {
            System.out.print(user);
            }

        }
}
