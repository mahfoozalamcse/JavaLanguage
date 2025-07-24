package String;

public class String3 {
    public static void main(String[] args) {
        System.out.println();
        String s1 = "mahfooz";
        String s2 = s1;
        s1 = s1 + "alam";
        if (s1 == s2) {
            System.out.println("  Same");
        }else{ // not same due to string which immutable
            System.out.println(  "Not same");
        }

        // String Builder(mutable) and String Buffrer(mutable and thread safe)
        StringBuffer sb = new StringBuffer("mahfooz");
        StringBuffer sb2 = sb;
        sb = sb.append("alam");
        if (sb == sb2) {  // same due to immutable // also thred safe
            System.out.println("  Same :");
        }else{
            System.out.println(" "+ " Nat same");
        }

        // String Builder
        StringBuilder sbl = new StringBuilder("mahfooz");
        StringBuilder sbl2 = sbl;
        sbl = sbl.append("alam");
        if (sbl == sbl2) { // same due to immutable
            System.out.println("  Same : ");
        }else{
            System.out.println(" Not same");
        }

    }
}
