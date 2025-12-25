package com.jobportal.model;

public class Application {

    private int applicationId;
    private int candidateId;
    private int jobId;
    private String status;

    public Application(int applicationId, int candidateId, int jobId, String status) {
        this.applicationId = applicationId;
        this.candidateId = candidateId;
        this.jobId = jobId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Application submitted:\n" +
                "\nCandidate ID: " + candidateId +
                "\nJob ID: " + jobId +
                "\nApplication Status: " + status;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
