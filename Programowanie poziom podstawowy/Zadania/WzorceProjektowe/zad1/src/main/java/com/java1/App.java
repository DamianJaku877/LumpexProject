package com.java1;

public class App 
{
    public static void main( String[] args )
    {
        Room room1 = new Room.Builder(1,10.65)
                .numberBed(2)
                .availability(true)
                .clearRoom(true)
                .bathroom(true)

                .build();

        Room room2 = new Room.Builder(2,6.90)
                .numberBed(3)
                .availability(true)
                .clearRoom(true)
                .bathroom(true)
                .build();

        System.out.println(room1);
        System.out.println(room2);
    }
}
