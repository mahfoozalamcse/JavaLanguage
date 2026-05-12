package part2;
import java.util.Arrays;

public class ArraysOp {
    public static void main(String[] args) {
      int[] arr = new int[3];
      arr[0] = 10;
      arr[1] = 5;
      arr[2] = 30;
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));

    int index = Arrays.binarySearch(arr, 5);
    System.out.println(index);

    Arrays.fill(arr, 10);
    System.out.println(Arrays.toString(arr));

    int arr1[] = new int[4];
    arr1[0] = 10;   
    arr1[1] = 20;
    arr1[2] = 30;
    arr1[3] = 40;
    
    for (int i : arr1) {
        System.out.print(i + " ");
    }
    System.out.println();

    change(arr1);
    for (int i : arr1) {
        System.out.print(i + " "); // here pass reference so change will reflect
    }

    // clone vs copy
    int arr2[] = Arrays.copyOf(arr1, arr1.length);
    for (int i : arr2) {
        System.out.print(i + " "); // here pass reference so change will reflect
    }

    int[] arr3 = arr1.clone();
    for (int i : arr3) {
        System.out.print(i + " "); // here is clone so new array will be created
    }

    // for each loop
    for (int i : arr3) {
        System.out.print(i + " "); 
    }
}
 public static void change(int[] arr) {
        arr[0] = 100;
    }
}
