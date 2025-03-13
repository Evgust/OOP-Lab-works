package com.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }
    public List<Account> getAccounts(){
        return accounts;
    }

    @Override
    public String toString(){
        return "Customer: " + firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}