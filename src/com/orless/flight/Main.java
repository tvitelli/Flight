package com.orless.flight;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CrewMember judy =
            new CrewMember(FlightCrewJob.Copilot);

        //gets a promotion

        judy.setJob(FlightCrewJob.Pilot);
    }
}
