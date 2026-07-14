package Mekushsorting;
import java.util.Scanner;

public class BasicBubblesort {
    public static void print(int[] arr){
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        print(arr);

        //basic bubble sort approach

//
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                   int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp
//            }
//        }
        // Slight optimised approach
//1st approach
//        for(int i=0;i<n-1;i++){ //n-1 passes
//            boolean isSorted =  true;
//            for(int j=0;j<n-1;j++){
//                if(arr[j]>arr[j+1]){
//                    isSorted = false;
//                    break;
//                }
//            }
//

//            if(isSorted) break;
//            for(int j=0;j<n-1-i;j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
        //2nd approach
        for (int i = 0; i < n - 1; i++) { // n-1 passes
            int swap = 0;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) break;
        }

        print(arr);
    }
}
