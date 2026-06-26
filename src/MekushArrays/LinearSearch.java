package MekushArrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7};
        int target = 3;
        int found = -1; //yha pe boolean data type me true false se bhi kiya jaa sakta hai
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }
        if (found!=-1) System.out.println("target exists in array at index " + found);
        else System.out.println("target missing in array");
    }
}
