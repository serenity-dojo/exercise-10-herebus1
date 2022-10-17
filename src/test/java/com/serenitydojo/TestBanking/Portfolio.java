package com.serenitydojo.TestBanking;

import com.serenitydojo.banking.InterestBearing;
import com.serenitydojo.banking.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<InterestBearing> accounts = new ArrayList<>() {
    };
    public void add(InterestBearing account) {
        accounts.add(account);
    }

    public double calculate_monthly_interest() {
        double sum = 0.0;
        for(InterestBearing account : accounts){
            sum = sum + account.calculate_monthly_interest();
        }
        return sum;
    }
}
