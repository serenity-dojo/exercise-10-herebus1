package com.serenitydojo.TestBanking;

import com.serenitydojo.banking.InterestYieldingBonds;
import com.serenitydojo.banking.SavingsAccount;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenCalculatingMonthlyInterest {

    @Test
    public void shouldCalculateForSavingsAccount(){
        //GIVEN
        SavingsAccount savingsAccount = new SavingsAccount(12000.0, 0.01);

        //WHEN
        double earnedInterest = savingsAccount.calculate_monthly_interest();

        //THEN
        assertThat(earnedInterest).isEqualTo(10.0);
    }

    @Test
    public void shouldCalculateInterestForBonds(){

        //GIVEN
        InterestYieldingBonds bonds = new InterestYieldingBonds(12000.0, 0.01);

        //WHEN
        double earnedInterest = bonds.calculate_monthly_interest();

        //THEN
        assertThat(earnedInterest).isEqualTo(10.0);

    }

    @Test
    public void calculateInterestEarnedInPortfolio(){

        //GIVEN
        Portfolio portfolio = new Portfolio();
        portfolio.add(new SavingsAccount(12000.0, 0.01));
        portfolio.add(new InterestYieldingBonds(12000.0, 0.01));

        //WHEN
        double totalEarnedInterest = portfolio.calculate_monthly_interest();

        //THEN
        assertThat(totalEarnedInterest).isEqualTo(20.0);

    }
}
