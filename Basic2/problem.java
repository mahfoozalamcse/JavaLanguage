package Basic2;

public class problem {
    public static void EvenOdd(int n){
        if (n % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    // Largest of three number
    public static void largestThree(int x, int y, int z){
      if (x > y && x > z) {
        System.out.println(x);
      }else if (y > x && y > z) {
        System.out.println(y);
      }else{
        System.out.println(z);
      }
    }

    // print leap year
    public static void leapYear(int year){
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year " + year);
        }else if (year % 400 == 0) {
            System.out.println("Leap year "+ year);
        }else{
            System.out.println("Not leap year ");
        }
    }
   public static void main(String[] args) {
        leapYear(2000);
        leapYear(2021);
        leapYear(2018);
    }
}
