package part2;

public class loops {
    public static void main(String[] args) {
        // for loop
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // while loop
        int i=0;
        while (i<5) {
            System.out.print(" " +i);
            i++;
        }
        System.out.println();
        // do while
        int j=0;
        do {
            System.out.print(j+ " ");
            j++;
        } while (j<=5);

        // infinite loop
        // for(;;) {
        //   System.out.println("Infinite");
        // }
    }
}
