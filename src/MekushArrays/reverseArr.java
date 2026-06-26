package MekushArrays;

import java.util.Scanner;

public class reverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for loop without any extra variable
        for(int i=0;i<n/2;i++){
            arr[i] = arr[i] + arr[n-i-1];
            arr[n-i-1] = arr[i] - arr[n-i-1];
            arr[i] = arr[i] - arr[n-i-1];

        }
        //while method
//        int i = 0,j = n-1;
        //if want reverse any part of the array:- then i = 2,j = 5 this type we do
        //1st while method using extra variable
//        while(i<j){
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//            i++;
//            j--;
//        }
        // 2nd while method without any variable
//           while(i<j){
//               arr[i]=arr[i]+arr[j];
//               arr[j]=arr[i]-arr[j];
//               arr[i]=arr[i]-arr[j];
//               i++;
//               j--;
//           }
        for(int a:arr){
            System.out.print(a+" ");
        }


    }
}
