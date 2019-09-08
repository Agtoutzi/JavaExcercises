package com.angelos;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("AA123456", 0,
                "Angelos", "blahblah@blahmail.com", 6900000000L);

        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());
        System.out.println(account.getCustomerMail());
        System.out.println(account.getCustomerPhone());
        System.out.println(account.getBalance());

        account.depositFunds(100);
        account.depositFunds(-100);
        account.withdrawFunds(50);
        account.withdrawFunds(50);
        account.withdrawFunds(50);
    }
}
