package PracticePart2;

public class Function {
   
    //  1 Simple Function: Print Hello (No return, No param)
    static void sayHello() {
        System.out.println("Hello, Welcome to FAANG Java Prep!");
    }

    //  2 Function with Parameters and Return Type
    static int add(int a, int b) {
        return a + b;
    }

    // 3 Function Returning Factorial (Recursion)
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    //  4 Function to Check Prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //  5 Function Overloading Example
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    // 6 Function to Find Max of Array
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    //  7 Recursive Function: Fibonacci
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //  8 Function to Reverse a String
    static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    //  9 Function to Check Palindrome String
    static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    // 10 Function with Default Arguments Concept (Overloading)
    static void greet() {
        System.out.println("Hello, User!");
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 11 Function to Calculate Power (Recursion)
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    //  12 Function Using Pass-by-Value
    static void increment(int x) {
        x++;
        System.out.println("Inside function x = " + x);
    }

    
    public static void main(String[] args) {
        System.out.println(" Java Function Practice (Google/FAANG)");

        // Q1
        sayHello();

        // Q2
        System.out.println("Q2 Sum = " + add(10, 20));

        // Q3
        System.out.println("Q3 Factorial(5) = " + factorial(5));

        // Q4
        System.out.println("Q4 29 is Prime? " + isPrime(29));

        // Q5
        System.out.println("Q5 Multiply int: " + multiply(3, 4));
        System.out.println("Q5 Multiply double: " + multiply(2.5, 4.2));

        // Q6
        int[] arr = {5, 9, 2, 7, 3};
        System.out.println("Q6 Max in array = " + findMax(arr));

        // Q7
        System.out.println("Q7 Fibonacci(7) = " + fibonacci(7));

        // Q8
        System.out.println("Q8 Reverse of 'Google' = " + reverse("Google"));

        // Q9
        System.out.println("Q9 'level' is Palindrome? " + isPalindrome("level"));

        // Q10
        greet();
        greet("Mahfooz");

        // Q11
        System.out.println("Q11 2^5 = " + power(2, 5));

        // Q12
        int val = 10;
        System.out.println("Before function x = " + val);
        increment(val);
        System.out.println("After function x = " + val + " (Pass by Value)");
    }
}


