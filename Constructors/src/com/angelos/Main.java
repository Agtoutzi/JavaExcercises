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

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
