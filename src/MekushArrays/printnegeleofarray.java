package MekushArrays;

import java.util.Scanner;

public class printnegeleofarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                continue;
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}
