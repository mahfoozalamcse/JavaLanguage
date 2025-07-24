package String;

public class String1 {
    public static void main(String[] args) {
        // character array/arraylist
        char[] ch = {'a', 'b', 'c', 'd'};
        System.out.println(ch);

        // String class // Immutable
        String str = "Mahfooz";
        System.out.println(str);

        String str2 = new String("Mahfooz");
        System.out.println(str2);

        // String Buffer 
        StringBuffer str3 = new StringBuffer("ALAM");
        System.out.println(str3);

        // String Builder
        StringBuilder str4 = new StringBuilder("Hanji..");
        System.out.println(str4);
    

    }
}
