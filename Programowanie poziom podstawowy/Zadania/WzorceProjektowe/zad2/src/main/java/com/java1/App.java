package com.java1;

public class App 
{
    public static void main( String[] args )
    {
        for(CarFactory.CarType carType : CarFactory.CarType.values()){
            System.out.println("Price of " + carType + " is " + CarFactory.creatCar(carType).getFuel());
        }
    }
}
