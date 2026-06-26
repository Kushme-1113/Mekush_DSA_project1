package MekushIfElse;

import java.util.Scanner;

public class divisibilitycheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%15==0){
            System.out.println("given no is divisible by 5 or 3 both");
        }
        else if(n%3==0){
            System.out.println("given no is divisible by 3 only");
        }
        else if(n%5==0){
            System.out.println("given no is divisible by 5 only");
        }
        else{
            System.out.println("given no is not divisible by 3 or 5 both");
        }
    }
}
