package MekushIfElse;

import java.util.Scanner;

public class pointcoordinate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first point coordinate: ");
        double x = input.nextDouble();
        System.out.print("enter second point coordinate: ");
        double y = input.nextDouble();
        if (x > 0) {
            if (y > 0) System.out.println("point lies in the first quadrant");
            else if (y < 0) System.out.println("point lies in the fourth quadrant");
            else System.out.println("point lies on the +ve x-axis");
        } else if (x < 0) {
            if (y > 0) System.out.println("point lies in the second quadrant");
            else if (y < 0) System.out.println("point lies in the third quadrant");
            else System.out.println("point lies on the -ve x-axis");
        } else {
            if (y > 0) System.out.println("point lies on the +ve y-axis");
            else if (y < 0) System.out.println("point lies on the -ve y-axis");
            else System.out.println("point lies on the origin");
        }
    }
}
