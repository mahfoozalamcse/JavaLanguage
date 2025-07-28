package String;

public class binarytoDec {
    public static void decTobn(int n){
        String s = "";
        while (n > 0) {
            s = (n % 2) + s;
            n = n / 2;
        }

        System.out.println();
        System.out.println(s);
    }

    // binary to decimal
    public static void binarytodec(String s){
        int count = 0;
        int k = 1;
        for(int i=s.length()-1; i>=0; i--){
            count += (s.charAt(i)-'0')*k;
            k = k*2;
        }

        System.out.println();
        System.out.println(count);
    }

    // pattern searching
    public static void pattern(String s, String pat){
        if (pat.length() > s.length())  {
            System.out.println("Enter valid pattern : ");
        }
        for(int i=0; i<s.length()-pat.length()+1; i++){
            if (s.substring(i, i+pat.length()).equals(pat)) {
                System.out.print(i+" ");
            }
        }
    }

    // 
    public static void main(String[] args) {
    //   int n = 10;
    //   decTobn(n);  
    //   String s = "1010";
    //   binarytodec(s);

    // pattern
    System.out.println();
    String s = "geeksforgeeks";
    String pat = "geeks";
    pattern(s, pat);
    }
}
