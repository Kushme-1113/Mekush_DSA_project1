package MekushIfElse;

import java.util.Scanner;

public class sidesoftriangleornot {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first side of triangle : ");
         double a = sc.nextDouble();
         System.out.print("Enter the second side of triangle : ");
         double b = sc.nextDouble();
         System.out.print("Enter the third side of triangle : ");
         double c = sc.nextDouble();
         if((a+b)>c && (a+c)>b && (b+c)>a){
             System.out.println("a,b & c are the sides of triangle");

         }
         else System.out.println("a,b & c are not the sides of triangle");

     }
}
