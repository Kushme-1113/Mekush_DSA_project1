package MekushBasics;
import java.util.Scanner;

public class Relationbool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
        System.out.print("Enter another number: ");
        int y = scan.nextInt();
        System.out.println(x>y);
        System.out.println(x==y);
        System.out.println(x<y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x!=y);
        boolean z = (5>3);
        System.out.println(z);

    }
}
