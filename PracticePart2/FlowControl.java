package PracticePart2;
import java.util.*;

public class FlowControl {
    
    public static void main(StringPractice[] args) {

        // Q1. If-Else: Check eligibility for driving
        int age = 17;
        if (age >= 18) {
            System.out.println("Q1 Eligible for driving");
        } else {
            System.out.println("Q1 Not eligible for driving");
        }

        // Q2. Nested If: Find largest of three numbers
        int a = 10, b = 20, c = 15;
        if (a > b && a > c) {
            System.out.println("Q2 Largest is a: " + a);
        } else if (b > c) {
            System.out.println("Q2 Largest is b: " + b);
        } else {
            System.out.println("Q2 Largest is c: " + c);
        }

        //  Q3. Switch Case: Simple calculator
        int x = 12, y = 6;
        char op = '/';
        switch (op) {
            case '+': System.out.println("Q3 " + (x + y)); break;
            case '-': System.out.println("Q3 " + (x - y)); break;
            case '*': System.out.println("Q3 " + (x * y)); break;
            case '/': System.out.println("Q3 " + (x / y)); break;
            default: System.out.println("Q3 Invalid Operator");
        }

        // Q4. For Loop: Sum of first N natural numbers
        int n = 5, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Q4 Sum of first " + n + " numbers = " + sum);

        //  Q5. While Loop: Reverse a number
        int num = 1234, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Q5 Reversed Number: " + reversed);

        //  Q6. Do-While: User Login Attempt (runs at least once)
        Scanner sc = new Scanner(System.in);
        String password;
        int attempts = 0;
        do {
            System.out.print("Q6 Enter password: ");
            password = sc.nextLine();
            attempts++;
            if (password.equals("admin123")) {
                System.out.println(" Login Successful");
                break;
            } else {
                System.out.println(" Wrong Password");
            }
        } while (attempts < 3);
        if (!password.equals("admin123")) {
            System.out.println(" Account Locked!");
        }

        sc.close();

        //  Q7. Enhanced For-Loop: Print array elements
        int[] arr = {2, 4, 6, 8, 10};
        System.out.print("Q7 Array Elements: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        //  Q8. Break Statement: Stop loop when condition met
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Q8 Breaking at " + i);
                break;
            }
        }

        //  Q9. Continue Statement: Skip specific iteration
        System.out.print("Q9 Skipping even numbers: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        //  Q10 Return Statement: Exit method early
        System.out.println("Q10 Sum of first 5 = " + calculateSum(5));
    }

    // Helper Method for Q10
    public static int calculateSum(int n) {
        if (n <= 0) return 0; // Return early if invalid input
        int total = 0;
        for (int i = 1; i <= n; i++) total += i;
        return total;
    }
}


