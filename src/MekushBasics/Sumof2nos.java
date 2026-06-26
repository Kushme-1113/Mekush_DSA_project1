package MekushBasics;

import java.util.Scanner;
public class Sumof2nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number is: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number is: ");
        double num2 = sc.nextDouble();
        double sum = num1+num2;
        System.out.println("The sum is: " + sum);
    }
}



