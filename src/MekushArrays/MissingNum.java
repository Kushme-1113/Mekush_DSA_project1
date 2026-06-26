package MekushArrays;

import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = (n*(n+1))/2;
        int ArrSum = 0;
        for(int i=0;i<arr.length;i++){
            ArrSum += arr[i];
        }
        int MissingNum = sum-ArrSum;
        System.out.println("Missing number: "+MissingNum);
    }

}
