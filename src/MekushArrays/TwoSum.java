package MekushArrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n = scan.nextInt();
        System.out.print("enter the target number:");
        int target = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
               if (arr[i] + arr[j] == target){
                   System.out.println("two indexes which give target elements after sum are:" + i + " " + j);

               }
               break;


            }
        }
    }

}
