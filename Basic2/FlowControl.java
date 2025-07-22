package Basic2;

import java.util.Scanner;

// import java.util.Scanner;

public class FlowControl {
   public static void main(String[] args) {
    //   // if else
    //   int n = 4;
    //   if (n % 2 == 0) {
    //      System.out.println("Even");
    //   }else{
    //     System.out.println("Odd");
    //   }

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // if (n % 10 == 0) {
    //     System.out.println("invalid");
    //     return;
    // }else{
    //     System.out.println("Valid");
    //     return;
    // }

    // int x = 45;
    // if (x % 10 == 0) {
    //     System.out.println(x);
    // }else if (x % 3 == 0) {
    //     System.out.println(x);
    // }else if (x % 5 == 0) {
    //     System.out.println(x);
    // }else{
    //     System.out.println("Invalid input ");
    // }

    // switch case
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    // Menu
    System.out.println("1. Addition");
    System.out.println("2. Multiplication");
    System.out.println("3. Devide");
    System.out.println("4. Minus");
  
    // Enter choice
    System.out.println("Enter choice : ");
    int choice = sc.nextInt();
    switch (choice) {
        case 1:
            int Addition = num1 + num2;
            System.out.println(Addition);
            break;
         case 2:
            int Multiplication = num1 * num2;
            System.out.println(Multiplication);
            break;
         case 3:
            int Devide = num1 / num2;
            System.out.println(Devide);
            break;
         case 4:
            int Minus = num1 - num2;
            System.out.println(Minus);
            break;
        default:
            System.out.println("Invalid input : ");
            break;
    }

    sc.close();

   } 
}
