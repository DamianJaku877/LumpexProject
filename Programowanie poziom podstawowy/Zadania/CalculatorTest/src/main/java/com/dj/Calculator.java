package com.dj;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b){
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Incorrect value");
        }
        return a / b;
    }

    public boolean isNumberEven(int i) {
        return i%2 == 0;
    }

    public double numberPower(double a, double b) {
        return Math.pow(a,b);
    }

    public double calculationVat(double netto) {
        return netto * 0.19;
    }


    public double bruttoOnNetto(double netto, double vat) {
        return ((vat / 100) * netto)+netto;
    }
}

