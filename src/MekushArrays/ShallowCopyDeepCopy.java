package MekushArrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);
        int[] y = Arrays.copyOf(arr,arr.length); // y is deep copy of arr
        y[0] = 150;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
