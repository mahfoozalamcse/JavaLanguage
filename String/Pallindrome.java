package String;

public class Pallindrome {
    public static boolean isPallindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 2.
    public static void reverse(String s){
        if (s.length() < 1) {
            System.out.println("");
        }
       StringBuilder sb = new StringBuilder("");

       for(int i = s.length()-1; i>=0; i--){
          sb.append(s.charAt(i));
       } 
       
       // print
        System.out.println(); 
        for(int i=0; i<sb.length(); i++){
            System.out.print(sb.charAt(i));
        }
    }

    // 3.
    public static void reverse2(String s){
        String b = "";
        for(int i=s.length()-1; i>=0; i--){
            b += s.charAt(i);
        }

        for(int i=0; i<b.length(); i++){
            System.out.print(b.charAt(i));
        }
        System.out.println();
    }
    public static void print(String s){
        for(int i=0; i<s.length(); i++){
            System.out.print(" "+s.charAt(i));
        }
    }

    public static void main(String[] args) {
        // String s = "madam";
         System.out.println();
        // System.out.println(isPallindrome(s));

        String s = "massage";
       // reverse(s);
       // print(s);
       reverse2(s);


    }
}
