package MekushSearch;

import java.util.Scanner;

public class FloorInSortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("enter the target element: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0, high = n-1,idx = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]>target){
                high = mid-1;
            }
            else{
                idx = mid;
                low = mid+1;
            }
        }
        System.out.println("the greatest element that is smaller than target is: "+arr[idx]+" and index is: "+idx);
    }

}
