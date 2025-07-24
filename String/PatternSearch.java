package String;

public class PatternSearch {
    public static void pattern(String str, String pat){
        int pos = str.indexOf(pat);
        while (pos >= 0) {
            System.out.println(" pos "+ pos);
            pos = str.indexOf(pat, pos+1);
        }  
    }

    // digit after decimal point
    public static String digitafterDecimal(String n){
        int pos = n.indexOf(".");
       if (pos < 0) {
         return "";
       }else{
         return n.substring(pos+1);
       }
    }
    public static void main(String[] args) {
        System.out.println();
        String str = "mahfooz alam mahfooz";
        String pat = "mahfooz";
        pattern(str, pat);

        // search 
        System.out.println(digitafterDecimal("123.9807604"));

    }
}
