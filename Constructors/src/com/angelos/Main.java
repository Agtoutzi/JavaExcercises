package com.angelos;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("AA123456");
        account.setCustomerName("Angelos");
        account.setCustomerMail("blahblah@blahmail.com");
        account.setCustomerPhone(6900000000L);
        account.setBalance(0);

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
