package Basic2;

public class Pattern {
    public static void main(String[] args) {
        // print star patern
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.println("* * * * *");
        }

        System.out.println("Number pattern : ");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(i);
            }
            System.out.println();
            
        }

        // single line
        int l=0;
        while (l < 5) {
            System.out.println(" * ");
            l++;
        }
        int m=0;
        while (m<5) {
            System.out.print(" * ");
            m++;
        }

        System.out.println();
        System.out.println("Tringle : ");
        int s = 1;
        while ( s <= 5) {
            int j = 0;
            while (j < s) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            s++;
        }


        System.out.println();
        System.out.println("Inverted Tringle : ");
        
        int n = 5;
        int h = 1;
        while (h <= n) {
            int j=1;
            while (j <= n - h) {
                System.out.print(" ");
                j++;
            }
            while (j <= n) {
                System.out.print(" * ");
                j++;
            }
            h++;
            System.out.println();
            
        }
    }
}
