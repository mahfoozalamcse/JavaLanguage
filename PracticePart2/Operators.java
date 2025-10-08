package PracticePart2;

public class Operators {
    
    public static void main(StringPractice[] args) {

        //Q1. Find Maximum of Three Numbers using Ternary Operator
        int a = 12, b = 25, c = 7;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Q1 Maximum of three numbers: " + max);

        // Q2. Check if a number is even or odd using Bitwise Operator
        int num = 29;
        if ((num & 1) == 0) {
            System.out.println("Q2 " + num + " is Even");
        } else {
            System.out.println("Q2 " + num + " is Odd");
        }

        //  Q3. Swap two numbers without using a third variable (using XOR)
        int x = 10, y = 20;
        System.out.println("Q3 Before Swap: x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Q3 After Swap: x = " + x + ", y = " + y);

        //  Q4. Check if a number is positive, negative, or zero using Ternary Operator
        int n = -5;
        String result = (n > 0) ? "Positive" : ((n < 0) ? "Negative" : "Zero");
        System.out.println("Q4 " + n + " is " + result);

        //  Q5. Calculate Total Salary using Arithmetic + Assignment Operators
        double baseSalary = 25000;
        double hra = baseSalary * 0.20; // 20% of base
        double da = baseSalary * 0.10;  // 10% of base
        double bonus = 5000;

        double totalSalary = baseSalary;
        totalSalary += hra;     // add HRA
        totalSalary += da;      // add DA
        totalSalary += bonus;   // add Bonus

        System.out.println("Q5 Total Salary: ₹" + totalSalary);

        //  Bonus Q6. Check if a year is Leap Year using Logical + Relational Operator
        int year = 2024;
        boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        System.out.println("Q6 Is Leap Year? " + isLeap);

        // Bonus Q7. Find Grade using Nested Ternary
        int marks = 82;
        String grade = (marks >= 90) ? "A+" :
                       (marks >= 80) ? "A" :
                       (marks >= 70) ? "B" :
                       (marks >= 60) ? "C" : "F";
        System.out.println("Q7 Grade for marks " + marks + " is " + grade);

        //  Bonus Q8. Compound Interest Calculation (using Arithmetic Operators)
        double principal = 10000, rate = 5, time = 2;
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
        System.out.println("Q8 Compound Interest after 2 years: ₹" + compoundInterest);

        //Bonus Q9. Check if number is divisible by both 3 and 5 using Logical Operator
        int number = 15;
        boolean divisible = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("Q9 " + number + " divisible by 3 and 5? " + divisible);

        //  Bonus Q10  Bitwise Shift Example (Multiply by 2)
        int val = 5;
        int multiplied = val << 1; // same as val * 2
        int divided = val >> 1;    // same as val / 2
        System.out.println("Q10 " + val + " *2 using << : " + multiplied);
        System.out.println("Q10 " + val + " /2 using >> : " + divided);
    }
}


