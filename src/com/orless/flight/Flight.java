package com.orless.flight;

/**
 * Created by Dad on 7/31/2016.
 */
public class Flight {
    private int passengers, flightNumber, seats = 150;     //field(s)
    private char flightClass;                  //added with flightNumber later to learn Initialization Blocks
    private boolean[] isSeatAvailable;         //sets up new array of boolean type
    private int totalCheckedBags;
    private int maxCarryOns = seats * 2, totalCarryOns;

    {                                             //Initialization Block start, needs brackets
        isSeatAvailable = new boolean[seats]      //initializes all seats to available=true

        for (i = 0; i < seats; i++)
            isSeatAvailable[i] = true;
    }

    public Flight() {            //constructor   executable code used during object creation to set initial state (like method with no return type)
//		seats = 150;        //moved to field
//		passengers = 0;     //will initialize as 0 as default so not needed

    }

    public Flight(int flightNumber) {
//		this();                    //chained up to Flight() before we created Initialization Block, now will run IB automatically
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
//		this();
        this.flightClass = flightClass;
    }

    public void add1Passenger() {        //method  AccessModifier returnType methodName(passed values)
//		if (passengers < seats)         //removed as new constructor hasSeating added
        if(hasSeating())
            passengers += 1;

        else
            handleTooMany();
    }

    public void add1Passenger(int bags) {
        if)hasSeating())                //check if seats still available before adding in bags
        add1Passenger();
        totalCheckedBags += bags;
    }

    private void handleTooMany() {
        System.out.println("Too many")
    }

    public boolean hasRoom(Flight f2) {    //f2 ref passed in to this instance
        int total this.passengers + f2.passengers;     //this keyword refers to this instance, f2 refers to passed reference
        return total >= seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }

    public int getSeats() {
        return seats;  //accessor - setter
    }

    public void setSeats(int seats) {
        this.seats = seats;  //mutator - getter
    }

    private boolean hasSeating() {
        return passengers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns <= maxCarryOns;
    }

    public void add1Passenger(Passenger p) {      //calls Passenger class for getCheckedBags method
        add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(int bags, int carryOns) {
        if (hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags());
            totalCarryOns += carryOns;
        }
    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags, carryOns);
    }

}
    public void addPassengers(Passenger... list) {    //elipse ... instead of [] makes array varible length passed in, must be last parameter passed
        if(hasSeating(list.length)) {
            passengers += list.length;
            for (Passenger passenger : list)          //looping thru array
                totalCheckedBags += passenger.getCheckedBags();
        }
        else
            handleTooMany();
    }
}




}
