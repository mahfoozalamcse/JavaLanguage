package Array;

public class Array2 {
    // Non primitive
    static class Point{
        int x;
        int y;
        Point(int a, int b){
            x = a;
            y = b;
        }
        @Override
        public String toString(){
          return "( " + x + " " + y + ")";
        }
    }
    public static void main(String[] args) {
        System.out.println();
        int a[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }

        // primitive stored
        System.out.println();
       float arr[] = {12.0f, 234.4f, 34.5f};
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
       }

       // non primitive
       System.out.println();
       Point[] p = {new Point(10, 20),
                    new Point(30, 50),
                    new Point(45, 59)};

        for (int j = 0; j < p.length; j++) {
            System.out.println(p[j]); // to strong
        }
    }
}
