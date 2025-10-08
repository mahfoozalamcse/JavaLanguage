package PracticePart2;

import java.util.Scanner;

public class Input {

    public static void main(StringPractice[] args) {

      Scanner sc = new Scanner(System.in);

      String name = sc.nextLine();
      int age = sc.nextInt();
      long number = sc.nextLong();
      char gender = sc.next().charAt(0);

      System.out.println("User name "+ name);
      System.out.println("User Age "+ age);
      System.out.println("User number "+ number);
      System.out.println("User gender "+ gender);


      sc.close();

    }
}
