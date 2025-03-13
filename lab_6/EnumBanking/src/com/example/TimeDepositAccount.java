package com.example;

import java.util.Calendar;
import java.util.Date;

public class TimeDepositAccount extends Account {
    
    private final Date maturityDate;
    
    public TimeDepositAccount(double balance, DepositLength duration) {
        super(balance);
        Calendar call = Calendar.getInstance();
        call.add(Calendar.DAY_OF_YEAR, duration.getDays());
        this.maturityDate = call.getTime();
    }

    @Override
    public boolean withdraw(double amount) {
        Date today = new Date();
        if(today.after(maturityDate)) {
            if(amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }
    
}