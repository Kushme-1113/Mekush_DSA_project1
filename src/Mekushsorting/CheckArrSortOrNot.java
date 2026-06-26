package Mekushsorting;

import java.util.Scanner;

public class CheckArrSortOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Not sorted");
                break;
            }
            else continue;

        }
        System.out.println("Array is already sorted");

    }
}
