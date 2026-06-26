package MekushIfElse;

import java.util.Scanner;

public class Magsmallerornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n>-69 && n<69){
            System.out.println("The number "+n+" is smaller than 69");
        }
        else{
            System.out.println("The number "+n+" is not smaller than 69");
        }
    }
}
