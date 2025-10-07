package PracticePart2;
import java.util.*;


public class Array{

    // 1 Print Array Elements
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    //  2 Find Maximum and Minimum
    static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    // 3 Sum of Array Elements
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    // 4 Reverse Array
    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //  5 Linear Search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // 6 Binary Search (Array must be sorted)
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 7 Rotate Array Right by K positions
    static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //8 Prefix Sum (Range Sum Query)
    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) pre[i] = pre[i - 1] + arr[i];
        return pre;
    }

    //  9 Find Second Largest Element
    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > largest) {
                second = largest;
                largest = val;
            } else if (val > second && val != largest) {
                second = val;
            }
        }
        return second;
    }

    // 10 Kadane’s Algorithm (Max Subarray Sum)
    static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }
        return maxSoFar;
    }

    // 11 Remove Duplicates from Sorted Array (In-Place)
    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    // 12 2D Array — Matrix Transpose
    static int[][] transposeMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 3, 9, 1, 5};

        System.out.println("Original Array:");
        printArray(arr);

        // 1. Print
        System.out.print(" Print Elements: ");
        printArray(arr);

        // 2. Min/Max
        System.out.print(" ");
        findMinMax(arr);

        // 3. Sum
        System.out.println(" Sum = " + sumArray(arr));

        // 4. Reverse
        reverseArray(arr);
        System.out.print(" Reversed: ");
        printArray(arr);
        reverseArray(arr); // restore

        // 5. Linear Search
        System.out.println(" Search 9: " + linearSearch(arr, 9));

        // 6. Binary Search
        Arrays.sort(arr);
        System.out.println(" Binary Search (5): " + binarySearch(arr, 5));

        // 7. Rotate
        rotateRight(arr, 2);
        System.out.print(" Rotated by 2: ");
        printArray(arr);

        // 8. Prefix Sum
        int[] prefix = prefixSum(arr);
        System.out.print(" Prefix Sum: ");
        printArray(prefix);

        // 9. Second Largest
        System.out.println(" Second Largest: " + secondLargest(arr));

        // 10. Max Subarray Sum
        int[] arr2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(" Max Subarray Sum: " + maxSubArraySum(arr2));

        // 11. Remove Duplicates
        int[] sortedArr = {1, 1, 2, 2, 3, 4, 4};
        int newLen = removeDuplicates(sortedArr);
        System.out.print(" Unique Elements: ");
        for (int i = 0; i < newLen; i++) System.out.print(sortedArr[i] + " ");
        System.out.println();

        // 12. 2D Transpose
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        int[][] trans = transposeMatrix(mat);
        System.out.println(" Transpose of Matrix:");
        for (int[] row : trans) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
 

