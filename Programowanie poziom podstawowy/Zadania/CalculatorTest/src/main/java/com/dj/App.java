package com.dj;

public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculationVat(3000));
        System.out.println(calculator.bruttoOnNetto(3000,23));
        System.out.println(calculator.bruttoOnNetto(3000,19));

    }
}
