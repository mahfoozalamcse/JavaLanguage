package part2;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]  + " ");
        }

        // jagged Array
        int[][] arr2 = new int[2][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
