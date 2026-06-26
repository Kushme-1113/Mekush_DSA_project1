package MekushArrays;

import java.util.Scanner;

public class arrIndexOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }
        }
        print(arr);

    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

}
