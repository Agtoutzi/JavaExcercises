package com.angelos;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        Car holden = new Car();
        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
