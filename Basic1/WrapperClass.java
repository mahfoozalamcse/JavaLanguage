package Basic1;

import java.util.ArrayList;
import java.util.HashMap;

public class WrapperClass {
    public static void main(String[] args) {
        // 1. primitive to wraper boxing
        int primitiveInt = 10;
        Integer wrapInt = Integer.valueOf(primitiveInt); // manual boxing
        Integer autoBox = primitiveInt; // auto bxing

        System.out.println(wrapInt);
        System.out.println(autoBox);


        // manual to primitive unboxing
        int unboxedInt = wrapInt.intValue();
        int autoUnbox = wrapInt;
        System.out.println(unboxedInt);
        System.out.println(autoUnbox);

        // use wrapper in collection
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12); // auto boxing int -> Integer
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);

        int total = 0;
        for(Integer value : list){
            total += value; // unboxing Integer -> int
        }
        System.out.println(total);


        // Eg. 2 wraper class 

        String word = "banana";
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : word.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        System.out.println("Character frequency : "+ freq);


        // autoboxing and unboxing 
         // Autoboxing: Converting int to Integer
        int x1 = 10;
        Integer x2 = x1; // Autoboxing

        // Unboxing: Converting Integer to int
        int x3 = x2; // Unboxing

        // Print values
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);

    }
}
