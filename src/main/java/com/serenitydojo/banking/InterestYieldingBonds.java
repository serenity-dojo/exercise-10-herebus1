package com.serenitydojo.banking;

public class InterestYieldingBonds implements InterestBearing {

    private double interestRate;
    private double value;

    public InterestYieldingBonds(double value, double interestRate) {
        this.value = value;
        this.interestRate = interestRate;
    }

    public double calculate_monthly_interest(){
        return value * interestRate / 12;
    }
}
