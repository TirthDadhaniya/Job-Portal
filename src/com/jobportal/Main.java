package com.jobportal;

import com.jobportal.model.*;
import com.jobportal.service.*;

public class Main {

    public static void main(String[] args) {

        User c = new Candidate(1, "Tirth", "tirth@mail.com", "1234");
        User comp = new Company(2, "Google", "hr@google.com", "abcd");
        User admin = new Admin(3, "Root", "admin@portal.com", "root");

        c.login();
        comp.login();
        admin.login();

        Job job = new Job(101, "Java Developer", "Backend role", "Remote");
        Application app = new Application(1, 1, 101, "NEW");

        JobService jobService = new JobService();

        jobService.postJob(job);
        jobService.applyForJob(app);

        System.out.println("Application Status: " + app.getStatus());

        jobService.viewAllJobs();
        jobService.viewAllApplications();

    }
}
