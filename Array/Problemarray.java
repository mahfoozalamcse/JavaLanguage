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

    public static int countDistinct3(int arr[]){
         int count = 0; boolean isdistinct = true;
         for(int i=0; i<arr.length; i++){
            for(int j=(i-1); j>=0; j--){
                if (arr[i] == arr[j]) {
                    isdistinct = false;
                    break;
                }
            }
            if (isdistinct == true) {
                count++;
            }
         }
         return count+1;
    }

    // maximum in array
    public static int maximum(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // sum of array
    public static int sumOfArray(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(" Sum of the array is : "+ sum);
        return sum;
    }

    // average of array
    public static void averageArray(int arr[]){
        int n = arr.length;
        int sum = sumOfArray(arr);
        int average = sum / n;
        System.out.println("Average array is : "+ average);
    }


    public static void main(String[] args) {
        System.out.println();
        // int arr[] = {12, 67, 90, 91};
        // System.out.println(isSorted(arr));

        // number of distinct element 
        int arr[] = {12, 34, 78, 78, 78, 10, 12, 34};
        // System.out.println(countDistinct(arr));

        // return count distinct
       // System.out.println(countDistinct2(arr));
       System.out.println(countDistinct3(arr));

       int arr3[] = {1, 2, 3, 4, 5};
       averageArray(arr3);

    }
}
