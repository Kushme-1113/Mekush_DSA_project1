package MekushArrays;

import java.util.Scanner;
import java.util.Arrays;

public class secndmax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secndmax = Integer.MIN_VALUE;
        //1st method
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > max) {
//                secndmax = max;
//                max = arr[i];
//            }
//            else if(arr[i]>secndmax){
//                secndmax = arr[i];
//            }
//            else continue;
        // calculate max
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // calculate second max
        for (int i = 0; i < n; i++) {
            if (arr[i] > secndmax && arr[i]!=max) {
                secndmax = arr[i];
            }
        }
        System.out.println("max is:"+max+" "+"and 2nd max is:"+secndmax);

    }

}
