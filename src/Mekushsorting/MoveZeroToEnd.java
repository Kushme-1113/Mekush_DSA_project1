package Mekushsorting;
import java.util.Scanner;

public class MoveZeroToEnd {
    public static void print(int[] arr) {
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        print(arr);
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {

                if (arr[j] != 0) continue;
                else {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }

}
