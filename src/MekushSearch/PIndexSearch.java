package MekushSearch;

import java.util.Scanner;

public class PIndexSearch {  // it is a mountain array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int low = 0, high = n - 1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                System.out.println("peak index is: "+mid+" and peak is: "+arr[mid]);
                break;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }


    }
}
