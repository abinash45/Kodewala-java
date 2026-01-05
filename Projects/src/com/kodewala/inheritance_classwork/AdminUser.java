package com.kodewala.inheritance_classwork;

public class AdminUser extends User {

    // THIS CONSTRUCTOR MUST EXIST
    public AdminUser(String name, String email) {
        super(email, name, "ADMIN");
    }

    public void showAdminDetails() {
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin Email: " + getEmail());
        showBasicInfo();
        System.out.println("Role: " + role);
    }
}
