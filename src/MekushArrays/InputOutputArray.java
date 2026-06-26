package MekushArrays;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
//        int[] arr = {1,4,7,9,10,15,19,25,30};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println();
//        int i = 0;
//        while(i<arr.length){
//            System.out.print(arr[i]+" ");
//            i++;
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(2*arr[i] + " ");
        }


    }
}
