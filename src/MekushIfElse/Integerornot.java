package MekushIfElse;

import java.util.Scanner;

public class Integerornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if(n==(int)n){
            System.out.println("Given no is an integer");
        }
        else{
            System.out.println("Given no is not an integer");
        }
    }
}
