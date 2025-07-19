package Basic1;

public class swap {
    // wraper class is need in non primitive data for object based require

    public static void wraper(){
        // Integer;
        // Long;
        // Boolean;
        // Character;
        // Double;
        // Float;
        // etc..
    }

   

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp  = a;
        a = b;
        b = temp;

        System.out.println(" "+ a+ " "+ b);

        // Auto boxing and un boxing
        int x  = 10;
        Integer y = x; // Auto boxing
        int z = x;    // Auto unboxing
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Integer h = 200, m = 200;
        
        if (h == m) {
            System.out.println("SAME"); 
        }else{
            System.out.println("Not same .. "); // output due to the refer different object


            // type conversion
            // widening
            int a1 = 10;
            long b1 = a1;
            float c1 = b1;
            System.out.println(c1);
            

            // narraow conversion
         long l = 10;
         int s = (int)l;
         System.out.println(s);
        }
    }
}
