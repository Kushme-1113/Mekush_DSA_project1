package Mekushsorting;

import java.util.Scanner;

public class BasicSelectSort {
    public static void print(int[] arr) {
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        print(arr);
        // 1st approach
//        for(int i=0; i<n-1; i++) { //n-1 passes
//            int min = Integer.MAX_VALUE;
//            int minIndex = -1;
//            for(int j=i; j<n; j++) {
//                if(arr[j] < min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
        // 2nd approach
        for(int i=0; i<n-1; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for(int j=0; j<n-i; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }


        print(arr);
    }
}
