package MekushBasics;

import java.util.Scanner;

public class Divisibleby5
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("Yes,Given no is divisible by 5 ");
        }
        else{
            System.out.println("No,Given no is not divisible by 5");
        }

    }
}

