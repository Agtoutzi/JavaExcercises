package com.angelos;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerMail;
    private long customerPhone;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public long getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(long customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Amount of " + amount + " added to your balance. New balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdrawFunds(double amount) {
        if (amount >= 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Amount of " + amount + " deducted from your balance. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }
}
