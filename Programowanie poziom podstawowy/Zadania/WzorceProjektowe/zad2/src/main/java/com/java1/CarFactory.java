package com.java1;

public class CarFactory{

    public enum CarType{
        Disel,
        Benzine,
        Electric
    }
    public static Car creatCar(CarType carType){
        switch (carType){
            case Disel:
                return new Diesel();
            case Benzine:
                return new Benzine();
            case Electric:
                return new Electric();
        }
        throw new IllegalArgumentException("CarType" + carType + " is not recognized.");
    }
}
