package Mekushsorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class CommonElements {
    public static void print(int[] arr) {
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the 1st array: ");
        int n = input.nextInt();
        System.out.print("Enter the size of the 2nd array: ");
        int m = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        System.out.print("Enter the elements of the 1st array: ");
        for(int i=0; i<n; i++) {
            a[i] = input.nextInt();
        }
        System.out.print("Enter the elements of the 2nd array: ");
        for(int i=0; i<m; i++) {
            b[i] = input.nextInt();
        }
        print(a);
        print(b);
        Arrays.sort(a);
        Arrays.sort(b);
        print(a);
        print(b);
        int i=0,j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(i<n && j<m) {
            if(a[i]==b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]) {
                j++;
            }
            else {
                i++;
            }
        }
        for (int num : ans) {
            System.out.print(num + " "); // एक ही लाइन में स्पेस के साथ प्रिंट करने के लिए
        }


    }

}
