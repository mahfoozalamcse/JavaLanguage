package Basic2;
public class Pattern2 {
    public static void pyramid(int n){
       int i=1;
       while (i <= n) {
          int j = 1;
          while (j <= (n-i)) {
             System.out.print(" ");
             j++;
          }
          int k = 1;
          while (k <= (2*i-1)) {
            System.out.print("*");
            k++;
          }
          System.out.println();
          i++;
       }
    }
    // factorial of the number
    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return n*factorial(n-1);
    }
    // fact iterative
    public static int factIterative(int n){
        int fact = 1;
        if (n == 1 || n == 0) {
            return 1;
        }
        while (n > 0) {
            fact = fact * n;
            n--;
        }

        return fact;
    }
    public static void gcd(int a, int b){
        int x = Math.min(a, b);
        int ans = 1;
        for(int i=1; i<=x; i++){
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        System.out.println(ans);
    }

    // LCM
    public static void lcm(int a, int b){
        int ans = 1;
        int x = Math.max(a, b);
        int y = a*b;

        for(int i=x; i<=y; i++){
            if (i%a == 0  && i%b == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    // all devisor
    public static void devisor(int n){
        for(int i=1; i<=n; i++){
            if (n % i == 0) {
                System.out.print(" " +i);
            }
        }
        System.out.println();
    }
    // is prime 
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for(int i=2; i<n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //efficient
    public static boolean isPrime2(int n){
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for(int i=2; i*i<=n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime3(int n){
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for(int i=5; i*i <= n; i+=6){
            if (n % i == 0 || n % (i+1) == 0) {
                return false;
            }
        }
        return true;
    }

    // fibonacci
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i=1; i<=n; i++){
            System.out.print(" "+a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        pyramid(5);
        System.out.println("Factorial : ");
        System.out.println(factorial(5));
        System.out.println("Factorial : ");
        System.out.println(factIterative(4));

        // GCD
        System.out.println();
        gcd(10, 15);

        //LCM
        System.out.println();
        lcm(10, 15);

        // devisor
        devisor(12);

        // fibbonacci
        fibonacci(7);
    }
}
