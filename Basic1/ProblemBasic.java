package Basic1;

public class ProblemBasic {
    public static int sumOfNatural(int n){
        if (n == 1) {
            return 1;
        }
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    // find last digit
    public static int lastDigit(int n){
      if (n<10 && n > 0) {
        return n;
      }
      if (n < 0) {
        return -1;
      }

      int last = n % 10;
      return last;
    }

    public static void daysBeforNdays(int n, int d){
        int x = n % 7;
        int ans = d - x;

        if (ans > 0) {
            System.out.println(ans);
        }else{
            System.out.println(ans+7);
        }
    }

    public static int nthTermAp(int n, int d, int a){
        int ans = (a + (n-1)*d);
        return ans;
    }

    // nth term gp
    public static int nthGP(int a, int r, int n){
        int ans = a*(int)(Math.pow(r, n-1));
        return ans;
    }
    public static void main(String[] args) {
        
    //    System.out.println("   "+sumOfNatural(5)); 
    //    System.out.println(lastDigit(123));
    //    System.out.println(lastDigit(-1));
    //    System.out.println(lastDigit(9));

    //    System.out.println();
    //    daysBeforNdays(9, 3);

    //    System.out.println();
    //    System.out.println(nthTermAp(5, 1, 2));

      System.out.println(nthGP(2, 3, 5));
    }
}
