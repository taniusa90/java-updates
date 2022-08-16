package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN PROGRESS");

    ProjectStatus() {
    }

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }
}
