package MekushBasics;

import java.util.Scanner;
public class Squareofno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        double square = num*num;
        System.out.println("The square is: " + square);
    }

}

