package AdvanceJava;

import java.math.BigInteger;
public class BigInteger1 {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("54");
        System.out.println(" A = "+A);
        String b = "1234567";
        BigInteger C = new BigInteger(b);
        System.out.println(C);

        BigInteger D = A.add(C);
        
        System.out.println(D);

        
    }
}
