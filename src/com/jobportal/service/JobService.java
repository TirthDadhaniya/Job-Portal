package com.jobportal.service;

import com.jobportal.model.Application;
import com.jobportal.model.Job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobService {

    // Stores jobs using jobId as key
    private Map<Integer, Job> jobs = new HashMap<>();

    // Stores all applications
    private List<Application> applications = new ArrayList<>();

    // Company posts a job
    public void postJob(Job job) {

        if (job == null) {
            throw new RuntimeException("Job can't be null");
        }

        jobs.put(job.getJobId(), job);

        System.out.println("Job posted successfully");
        System.out.println("Title: " + job.getTitle());
        System.out.println("Description:" + job.getDescription());
        System.out.println("Location: " + job.getLocation());
    }

    public void applyForJob(Application application) {

        if (application == null) {
            throw new RuntimeException("Application can't be null");
        }

        applications.add(application);

        System.out.println("Application submitted:");
        System.out.println("Candidate ID: " + application.getCandidateId());
        System.out.println("Job ID: " + application.getJobId());
        application.setStatus("APPLIED");
    }

    public void viewAllJobs() {

        if (jobs.isEmpty()) {
            System.out.println("No jobs available");
            return;
        }

        for (Job job : jobs.values()) {
            System.out.println(job);
        }
    }

    public void viewAllApplications() {

        if (applications.isEmpty()) {
            System.out.println("No applications found");
            return;
        }

        for (Application app : applications) {
            System.out.println(app);
        }
    }


}