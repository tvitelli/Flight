package com.orless.flight;

/**
 * Created by Dad on 7/31/2016.
 */
public class Passenger
        private int checkedBags;
        private int freeBags;

        public int setCheckedBags(int checkedBags) {this.checkedBags = checkedBags;}
        public int setFreeBags(int freeBags) {this.freeBags = freeBags;}

        private double perBagFee;

        public Passenger() {                 //constructor needed if we wish to have no arguments

        }
        public Passenger(int freeBags) {
            this(freeBags > 1 ? 25.0d : 50.0d);   //line added to set fee based on number of free bags they are allowed (to call private perBagFee)
            this.freeBags = freeBags
        }
        public Passenger(int freeBags, int checkedBags) {
            this(freeBags);                  //constructor can call another constructor, but it must be the first line in the calling constructor
            this.checkedBags = checkedBags;
        }
        private Passenger(double perBagFee) {         //made private so it can only be called within the Passenger class
            this.perBagFee = perBagFee;
        }


