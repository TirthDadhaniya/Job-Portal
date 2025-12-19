package com.jobportal.model;

public class Candidate extends User {

    public Candidate(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void login(){
        System.out.println("Candidate logged in");
    }
}
