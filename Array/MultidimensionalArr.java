package Array;

public class MultidimensionalArr {
    public static void main(String[] args) {
        //  int [][] arr = {{1, 2, 3},
        //                 {4, 5, 6},
        //                 {7, 8, 9}};

        System.out.println();
        // // print array
        // for(int i=0; i<arr.length; i++){
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print(" "+arr[i][j]);
        //     }
        //     System.out.println();
        // }
        
        // other way
        int n = 2, m = 3;
        int arr2[][] = new int[n][m];
        // print array
        for(int i=0; i<arr2.length; i++){
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = 10;
                System.out.print(" "+arr2[i][j]);
            }
            System.out.println();
        }
    }
}
