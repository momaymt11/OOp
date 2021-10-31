package com.company;

public class Driver {

    private int NoOfTrip;
    private int rate;

    public Driver(int NoOfTrip, int rate) {
        this.NoOfTrip = NoOfTrip;
        this.rate = rate;
    }
    public int getNoOfTrip() {
        return NoOfTrip;
    }

    public void setNoOfTrip(int NoOfTrip) {

        this.NoOfTrip = NoOfTrip;
    }
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {

        this.rate = rate;
    }
    public int getPayment() {
        int payment = NoOfTrip*rate;
        System.out.println("Driver payment: " + NoOfTrip + " plus " + payment);
        return payment;
    }
}