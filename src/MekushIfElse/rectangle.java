package MekushIfElse;

import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double b = sc.nextDouble();
        double area = l*b;
        System.out.println("The area of the rectangle is "+area);
        double perimeter = (l+b)*2;
        System.out.println("The perimeter of the rectangle is "+perimeter);
        if (area > perimeter){
            System.out.println("The area is greater than perimeter");
        }
        else{
            System.out.println("The area is less than perimeter");
        }

    }
}

