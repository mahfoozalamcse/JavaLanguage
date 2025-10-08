package AdvanceJava2;
import java.util.*;
public class MethodRefrence {
  

// 1. Reference to a Static Method

/* 
class MathUtils {
    public static int square(int n) {
        return n * n;
    }
}


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        nums.forEach(n -> System.out.println(MathUtils.square(n)));  // Lambda

        // Using Method Reference
        nums.forEach(MathUtils::square);
    }
}

*/


// 2. Reference to an Instance Method of a Particular Object
// public static void main(String[] args) {
//         List<String> names = Arrays.asList("Mahfooz", "Aman", "Raj", "Rahul");

//         // Using Lambda
//         names.forEach(s -> System.out.println(s));

//         // Using Method Reference
//         names.forEach(System.out::println);
//     }
// }


// 3. Reference to an Instance Method of an Arbitrary Object
public static void main(String[] args) {
        List<String> names = Arrays.asList("mahfooz", "alam", "google", "faang");

        // Using Lambda
        names.replaceAll(s -> s.toUpperCase());

        // Using Method Reference
        names.replaceAll(String::toUpperCase);

        System.out.println(names);
    }
}


// 4. 



    







