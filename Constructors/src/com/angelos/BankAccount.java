package com.angelos;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerMail;
    private long customerPhone;

    public BankAccount() {
        this("1234", 0, "Default name", "Default mail", 12345L);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerMail, long customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerMail = customerMail;
        this.customerPhone = customerPhone;

        System.out.println("Constructor with parameters called");
    }

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
