import java.util.Scanner;
 
public class chapter1 { 
 
    public static void main(String[] args) {
       // arithmetic operation
        int a = 10, b = 5; 
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // comprision
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false 
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        // logical 
        boolean x = true, y = false;
        System.out.println(x && y); // false
        System.out.println(x || y); // true
        System.out.println(!x);     // false


        //unary
        // int a = 5;
        System.out.println(++a); // 6 (pre-increment)
        System.out.println(a++); // 6 (post-increment)
        System.out.println(a);   // 7
        System.out.println(--a); // 6 (pre-decrement)
        System.out.println(a--); // 6 (post-decrement)
        System.out.println(a);   // 5

        // ternary
        // int a = 10, b = 20;
        // int min = (a < b) ? a : b;
        // System.out.println("Minimum: " + min);

        // take input from user and perform operation

         Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Performing arithmetic operations
        System.out.println("Sum: " + (num1 + num2));
        
        System.out.println("Difference: " + (num1 - num2));

        System.out.println("Product: " + (num1 * num2));

        // Handling division by zero case
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");

        }

        sc.close();

    }
}
