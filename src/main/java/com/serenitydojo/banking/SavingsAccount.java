package com.serenitydojo.banking;

public class SavingsAccount extends BankAccount implements InterestBearing{
    private double interest_rate;

    public SavingsAccount(double initialBalance, double interest_rate) {
        this.interest_rate = interest_rate;
        setBalance(initialBalance);
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double calculate_monthly_interest(){
        return interest_rate * getBalance() / 12;
    }
}
