import java.util.Scanner;

public class chapter2 {

    public static void main(String[] args) { 
 
     // find largest in 3 number use ternary
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first number :");
     int num1 = sc.nextInt();
     System.out.println("Enter second number :");
     int num2 = sc.nextInt();
     System.out.println("Enter third number :");
     int num3 = sc.nextInt();

     int greater = (num1 > num2) ?(num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
     System.out.println(greater);

     sc.close();
    }
}
