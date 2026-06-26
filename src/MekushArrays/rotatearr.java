package MekushArrays;

import java.util.Scanner;

public class rotatearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to rotate: ");
        int k = sc.nextInt();
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        k %= n;
//        rotates from the right
//          reverse(arr,n-k,n-1);
//          reverse(arr,0,n-k-1);
//          reverse(arr,0,n-1);
//          for(int a:arr){
//            System.out.print(a+" ");
//          }
        //rotates from the left
          reverse(arr,0,k-1);
          reverse(arr,k,n-1);
          reverse(arr,0,n-1);

    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
