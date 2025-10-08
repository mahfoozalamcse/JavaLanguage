package AdvanceJava2;
import java.math.*;

public class BigIntegerMaster {
  
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }

    public static BigInteger fibonacci(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, c = BigInteger.ZERO;
        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("98765432109876543210");

        System.out.println("Addition: " + a.add(b));
        System.out.println("Subtraction: " + b.subtract(a));
        System.out.println("Multiplication: " + a.multiply(b));
        System.out.println("Division: " + b.divide(BigInteger.valueOf(10)));
        System.out.println("Modulus: " + b.mod(BigInteger.valueOf(97)));
        System.out.println("Power: " + a.pow(2));
        System.out.println("GCD: " + a.gcd(b));
        System.out.println("Compare: " + a.compareTo(b));
        System.out.println("Max: " + a.max(b));
        System.out.println("Min: " + a.min(b));
        System.out.println("Is Probable Prime? " + BigInteger.valueOf(17).isProbablePrime(10));
        System.out.println("Next Prime: " + BigInteger.valueOf(17).nextProbablePrime());

        BigInteger m = new BigInteger("1000000007");
        System.out.println("Modular Exponentiation (5^100 mod 13): " + BigInteger.valueOf(5).modPow(BigInteger.valueOf(100), BigInteger.valueOf(13)));
        System.out.println("Factorial of 25: " + factorial(25));
        System.out.println("Fibonacci(50): " + fibonacci(50));
    }
}
  

