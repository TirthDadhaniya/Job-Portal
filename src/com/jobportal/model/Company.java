package com.jobportal.model;

public class Company extends User{

    public Company(int id, String name, String email, String password) {
        super(id, name, email, password);
    }


    @Override
    public void login(){
        System.out.println("Company logged in");
    }
}
