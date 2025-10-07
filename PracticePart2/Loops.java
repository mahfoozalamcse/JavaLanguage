package PracticePart2;
import java.util.*;;

public class Loops {
   
    public static void main(String[] args) {

        // Q1. Print numbers from 1 to 10 using For loop
        System.out.print("Q1 Numbers 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //  Q2. Sum of first N natural numbers
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Q2 Sum of first " + n + " = " + sum);

        //  Q3. Factorial of a number (important)
        int num = 5;
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Q3 Factorial of " + num + " = " + fact);

        //  Q4. Reverse a number using While Loop
        int rev = 0, number = 12345, temp = number;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println("Q4 Reverse of " + number + " = " + rev);

        //  Q5. Count digits in a number
        int digits = 0, n2 = 987654;
        int copy = n2;
        while (copy > 0) {
            digits++;
            copy /= 10;
        }
        System.out.println("Q5 Number of digits in " + n2 + " = " + digits);

        // Q6. Check if a number is Prime
        int p = 29;
        boolean isPrime = true;
        if (p <= 1) isPrime = false;
        else {
            for (int i = 2; i * i <= p; i++) {
                if (p % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Q6 " + p + (isPrime ? " is Prime" : " is Not Prime"));

        //  Q7. Fibonacci Series up to N terms
        int t1 = 0, t2 = 1, terms = 8;
        System.out.print("Q7 Fibonacci: " + t1 + " " + t2 + " ");
        for (int i = 3; i <= terms; i++) {
            int next = t1 + t2;
            System.out.print(next + " ");
            t1 = t2;
            t2 = next;
        }
        System.out.println();

        //  Q8. Nested Loop: Print Star Pattern
        System.out.println("Q8 Star Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //  Q9. Sum of digits of a number using While
        int val = 1234, total = 0;
        int copy2 = val;
        while (copy2 > 0) {
            total += copy2 % 10;
            copy2 /= 10;
        }
        System.out.println("Q9 Sum of digits of " + val + " = " + total);

        //  Q10 Palindrome Number check
        int num2 = 1221;
        int temp2 = num2, rev2 = 0;
        while (temp2 != 0) {
            rev2 = rev2 * 10 + (temp2 % 10);
            temp2 /= 10;
        }
        System.out.println("Q10 " + num2 + (rev2 == num2 ? " is Palindrome" : " is Not Palindrome"));

        //  Q11. Do-While Loop: Guess Number Game
        Scanner sc = new Scanner(System.in);
        int secret = 7, guess;
        do {
            System.out.print("Q11 Guess the number (1-10): ");
            guess = sc.nextInt();
            if (guess == secret) {
                System.out.println(" Correct!");
                break;
            } else {
                System.out.println(" Try again!");
            }
        } while (true);

        //  Q12. Enhanced For Loop: Array sum
        int[] arr = {3, 6, 9, 12, 15};
        int arrSum = 0;
        for (int val2 : arr) {
            arrSum += val2;
        }
        System.out.println("Q12 Sum of array elements = " + arrSum);

        sc.close();
    }
}


