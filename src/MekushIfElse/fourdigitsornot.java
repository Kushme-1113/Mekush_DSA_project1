package MekushIfElse;

import java.util.Scanner;

public class fourdigitsornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("The number "+n+" is a four digit number");

        }
        else{
            System.out.println("The number "+n+" is not a four digit number");
        }

    }
}
