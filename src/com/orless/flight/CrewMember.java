package com.orless.flight;

/**
 * Created by Dad on 8/7/2016.
 */
public class CrewMember {
    private FlightCrewJob job;

    //stuff

    //constructor
    public CrewMember(FlightCrewJob job) {
        this.job = job;
    }

    //setter to change the job
    public void setJob(FlightCrewJob job) {
        this.job = job;
    }
}
