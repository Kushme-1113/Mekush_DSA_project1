package Mekushsorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumSortMeth {
    public static void print(int[] arr) {
        for(int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        print(arr);
        Arrays.sort(arr);
        print(arr);
        System.out.print("enter the target element: ");
        int target = in.nextInt();
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target) {
                System.out.println(i+","+j);
                break;
            }
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }
        if(i>j) System.out.println("no target found");

    }

}
