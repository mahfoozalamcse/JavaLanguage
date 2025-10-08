package PracticePart2;
// interface

public class InterFace {
//     static interface Vehicle {
//          void start();
//      }

//    static class Car implements Vehicle {
//     public void start() {
//         System.out.println("  Car started!");
//     }
//    }

//     public static void main(String[] args) {
//         Vehicle v = new Car();
//         v.start();
//     }

// }


// Enum 
//   enum Level {
//      LOW,
//      MEDIUM,
//      HIGH
//    }

//     public static void main(String[] args) {
//         Level level = Level.HIGH;
//         System.out.println(level);
//     }
// }


// real world example
static class Product {
    String name;
    double price;
}


    public static void main(StringPractice[] args) {
        Product p1 = new Product();
        p1.name = "Laptop";
        p1.price = 55000.99;

        System.out.println("Product: " + p1.name + ", Price: ₹" + p1.price);
    }
}