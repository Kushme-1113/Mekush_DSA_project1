package MekushBasics;

import java.util.Scanner;
public class Divisionofdatatypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        double division = num1 / num2;
        System.out.println("The division is " + division);
    }
}

