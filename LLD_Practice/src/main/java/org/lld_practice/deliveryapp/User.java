package org.lld_practice.deliveryapp;

public abstract class User {
    Long id;
    String userName;
    String password;
    String email;
    String address;
    UserRole role;

    public void register() {
        // registering
    }

    public void login() {
        // login and sign-in
    }

    public void updateProfile() {
        // update user profile
    }
}
