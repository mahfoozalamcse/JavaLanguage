package Array;

public class Array1 {
    public static void main(String[] args) {
        int arr[] = {12, 78, 90, 98};
        for (int i = 0; i < arr.length; i++) {
          //  System.out.print(arr[i]);
        }

        // diffrent type array declaration
        System.out.println();
        int a[];
        a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        for(int i=0; i<a.length; i++){
            System.out.print(" "+a[i]);
        }

        // 2.
        System.out.println();
        int b[] = new int[3];
        b[0] = 12;
        b[1] = 13;
        b[2] = 14;
        for(int i=0; i<b.length; i++){
            System.out.print("  "+b[i]);
        }

        // 3
        System.out.println();
        int c[] = {10, 20, 30};
        for(int i=0; i<c.length; i++){
            System.out.print("  "+c[i]);
        }

        // 4
        System.out.println();
        int d[] = new int[3];
        int x = 10;
        for(int i=0; i<d.length; i++){
            d[i] = x;
            x = x + 10;
            System.out.print("  "+d[i]);
        }

        // array declaration diffrent int[] arr vs int arr[]
        // fine
        // int l[], m;
        // l = new int[4];
        // m = 4;

        // // array declaration not fine
        // int[] h, s;
        // h = new int[3];
       //  s = 20; give error due to uncampatible type

        
    }
}
