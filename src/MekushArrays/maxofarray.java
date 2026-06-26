package MekushArrays;

import java.util.Scanner;
import java.util.Arrays;

public class maxofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            else continue;
        }
        System.out.println("Maximum number in the array is " + max);
    }
}
