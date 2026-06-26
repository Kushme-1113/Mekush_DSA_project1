package MekushArrays;

import java.util.Scanner;

public class prodofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= arr[i];
        }
        System.out.println(prod);
    }
}
