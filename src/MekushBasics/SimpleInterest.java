package MekushBasics;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        double pr = input.nextDouble();
        System.out.println("Enter the rate: ");
        double rate = input.nextDouble();
        System.out.println("Enter the years: ");
        int time = input.nextInt();
        double si = pr*rate*time/100;
        System.out.println("The principle is: " + pr);
        System.out.println("The rate  is: " + rate);
        System.out.println("The years is: " + time);
        System.out.println("The simple interest is: " + si);

    }
}



