package MekushIfElse;

import java.util.Scanner;
public class Greatestofthem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first num:");
        int a = sc.nextInt();
        System.out.print("enter the second num:");
        int b = sc.nextInt();
        System.out.print("enter the third num:");
        int c = sc.nextInt();
        int greatest = ((a>b)?((a>c)?a:c):((b>c)?b:c));
        System.out.println("The greatest number is "+greatest);
    }
}

