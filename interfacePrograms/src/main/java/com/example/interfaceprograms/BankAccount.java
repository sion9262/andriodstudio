package com.example.interfaceprograms;

public class BankAccount  implements Meaurable{
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;

    public BankAccount(int balance){
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
