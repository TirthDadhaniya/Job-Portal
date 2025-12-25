package com.jobportal.model;

public class Job {

    private int jobId;
    private String title;
    private String description;
    private String location;

    public Job(int jobId, String title, String description, String location) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Job posted successfully\n" +
                "Title: " + jobId +
                "\nDescription:" + description +
                "\nLocation: " + location;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
