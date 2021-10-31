package com.company;

public class Cleaner {
    private int dayWork;
    private int rate;
    public Cleaner( int dayWork, int rate) {
        this.dayWork = dayWork;
        this.rate = rate;
    }

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork) {

        this.dayWork = dayWork;
    }
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {

        this.rate = rate;
    }

    public int getPayment() {
        int payment = this.dayWork * this.rate;
        System.out.println("Cleaner DayWork: " + dayWork + " plus " + payment);
        return payment;
    }
}
