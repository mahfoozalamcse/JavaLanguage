package Basic3;

public class problem {
    // first digit of the number
    public static int firstDigit(int n){
       while (n > 10) {
          n = n / 10;
       }

       return n;
    }
    // prime factorization
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeFactor(int n){
        for(int i=2; i<n; i++){
            if (isPrime(i)) {
               int x = i;
                while (n % x == 0) {
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }
    public static void main(String[] args) {
      System.out.println();
      System.out.println(firstDigit(123));  

      // prime factor
      System.out.println();
      primeFactor(100);
    }
}
