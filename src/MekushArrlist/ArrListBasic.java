package MekushArrlist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.get(0));  //arr[0]
        arr.set(0,5); //arr[0] = 5
        System.out.println(arr); // not traversing the array by ourselves
        int n = arr.size(); //arr.length
        for (int i = 0; i < n; i++) {
        System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        arr.add(6);
        System.out.println(arr);
        arr.add(2,8);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
//        Collections.reverse(arr);
        System.out.println(arr);
    }
}
