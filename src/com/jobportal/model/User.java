package com.jobportal.model;

import com.jobportal.util.Authenticatable;

public abstract class User implements Authenticatable {

    protected int id;
    protected String name;
    protected String email;
    protected String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public void logout() {
        System.out.println(name + " logged out");
    }
}
