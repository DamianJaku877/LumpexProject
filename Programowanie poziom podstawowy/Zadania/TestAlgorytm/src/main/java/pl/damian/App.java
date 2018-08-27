package pl.damian;

import java.util.Scanner;

import static pl.damian.BubbleSort.b_sort;

public class App {
    public static void main(String[] args) {

        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array");
        number = in.nextInt();

        int[] tab = new int[number];
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Enter the element of the table:");
            tab[i] = in.nextInt();
        }
        b_sort(tab);
    }
}
