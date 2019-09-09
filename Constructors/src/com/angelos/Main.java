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

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println("VIP 1: " + vipCustomer1.getName() + " " + vipCustomer1.getMailAddress() + " " + vipCustomer1.getCreditLimit());
        VipCustomer vipCustomer2 = new VipCustomer("customer 2", "customer2@mail.com");
        System.out.println("VIP 2: " + vipCustomer2.getName() + " " + vipCustomer2.getMailAddress() + " " + vipCustomer2.getCreditLimit());
        VipCustomer vipCustomer3 = new VipCustomer("customer 3", 100, "customer3@mail.com");
        System.out.println("VIP 3: " + vipCustomer3.getName() + " " + vipCustomer3.getMailAddress() + " " + vipCustomer3.getCreditLimit());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
