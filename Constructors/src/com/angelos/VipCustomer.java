package com.angelos;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String mailAddress;

    public VipCustomer() {
        this("defaultName", "defaultMail");
    }

    public VipCustomer(String name, String mailAddress) {
        this(name, 0.0, mailAddress);
    }

    public VipCustomer(String name, double creditLimit, String mailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.mailAddress = mailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getMailAddress() {
        return mailAddress;
    }
}
