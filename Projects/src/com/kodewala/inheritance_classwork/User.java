package com.kodewala.inheritance_classwork;

public class User {

    private String email;
    private String name;
    String role; // default access

    public User(String email, String name, String role) {
        this.email = email;
        this.name = name;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void showBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
