package com.jobportal.service;

import com.jobportal.model.Application;
import com.jobportal.model.Job;

public class JobService {

    // Company posts a job
    public void postJob(Job job) {

        if (job == null) {
            throw new RuntimeException("Job can't be null");
        }

        System.out.println("Job posted successfully");
        System.out.println("Title: " + job.getTitle());
        System.out.println("Description:" + job.getDescription());
        System.out.println("Location: " + job.getLocation());


    }

    public void applyForJob(Application application) {

        if (application == null) {
            throw new RuntimeException("Application can't be null");
        }

        System.out.println("Application submitted:");
        System.out.println("Candidate ID: " + application.getCandidateId());
        System.out.println("Job ID: " + application.getJobId());
        application.setStatus("APPLIED");
    }
}