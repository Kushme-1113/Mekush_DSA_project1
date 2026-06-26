package MekushBasics;

import java.util.Scanner;
public class ModulusOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter a number: ");
        int b = input.nextInt();
        int rem = a%b;
        System.out.println("The modulus of " + a + " and " + b + " is " + rem);
    }
}

