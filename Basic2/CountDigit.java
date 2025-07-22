package Basic2;

public class CountDigit {
    public static void main(String[] args) {
        int n = 123;
        int digit = 0;
        while (n > 0) {
            n = n / 10;
            digit++;
           
        }
        System.out.println();
        System.out.println(digit);
    }
}
