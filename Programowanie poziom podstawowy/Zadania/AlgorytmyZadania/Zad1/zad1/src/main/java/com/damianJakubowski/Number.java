package com.damianJakubowski;

import java.util.Scanner;

public class Number {
    Scanner sc = new Scanner(System.in);

    public int sum(){

        System.out.println("a=");
        int a = sc.nextInt();
        System.out.println("b=");
        int b = sc.nextInt();
        System.out.println("c=");
        int c = sc.nextInt();

           int result = 0;

           if(a%2==0){
               result += a;
           } else{
               result -= a;
           }
           if (b%2==0){
               result += b;
           } else {
               result -= b;
           }
           if (c%2==0){
               result += c;
           } else {
               result -= c;
           }
           return result;
       }
}
