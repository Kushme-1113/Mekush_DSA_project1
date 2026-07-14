package Mekushsorting;
import java.util.Scanner;

public class SortinDecend {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        for(int i=0;i<n-1;i++){//n-1 passes
            int swaps = 0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;


        }
        print(arr);

    }
}
