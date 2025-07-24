package String;

public class String2 {
    public static void main(String[] args) {
        String str = "Mahfooz";
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2, 4));
        System.out.println(str.length());

        String s1 = "mahfooz";
        String s2 = "mahfooz";
        if (s1 == s2) {  // here both point same memory location
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        String s3 = new String("mahfooz"); // here point differen memory location
        if (s1 == s3) {
            System.out.println("equal");
        }else if (s2 == s3) {
            System.out.println("is equal ");
        }else{
            System.out.println("Not equal with both ");
        }

        boolean res = s1.contains(s2);
        System.out.println(res);
        int res1 = s1.compareTo(s2);
        System.out.println(res1);
        if (res1 == 0) {
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }

        boolean res2 = s1.equals(s3); // compare length
        System.out.println(res2);

        String s4 = "hello mahfooz";
        String s5 = "mahfooz";
        int res4 = s4.indexOf(s5);
        System.out.println(res4);


        String s6 = "hellO";
        String s7 = "HellO";
        System.out.println(s6.equalsIgnoreCase(s7));

    }
}
