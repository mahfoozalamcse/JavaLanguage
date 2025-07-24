package Array;

import java.util.Arrays;

public class Problemarray {
    // check array is sorted
    public static boolean isSorted(int arr[]){
      for (int i = 0; i < arr.length-1; i++) {
         if (arr[i+1] < arr[i]) {
            return false;
         }
      }
      return true;
    }
    // count distinct element for sorted 
    public static int countDistinct(int arr[]){
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if (arr[i-1] != arr[i]) {
                count++;
            }
        }
        return count+1;
    }
    // count distinct for unsorted time O(nlogn)
    public static int countDistinct2(int arr[]){
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println();
        // int arr[] = {12, 67, 90, 91};
        // System.out.println(isSorted(arr));

        // number of distinct element 
        int arr[] = {12, 34, 78, 78, 78, 10, 12, 34};
        // System.out.println(countDistinct(arr));

        // return count distinct
        System.out.println(countDistinct2(arr));
    }
}
