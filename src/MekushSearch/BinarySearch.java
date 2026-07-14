package MekushSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the array size: ");
            int n = input.nextInt();
            System.out.print("Enter the searched element: ");
            int target = input.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter array elements: ");

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            int low = 0, high = n - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] < target) {
                    low = mid + 1;
                }
                else if (arr[mid] > target) {
                    high = mid - 1;
                }
                else {
                    System.out.println("Element found at index: " + mid);
                    break;
                }
            }

        }
}
