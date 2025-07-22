package Basic1;
public class Operator {
    public static void main(String[] args) {
      // Arithmetic operator
    //   int a = 10;
    //   int b = 20;
    //   System.out.println(a+b);
    //   System.out.println(a*b);
    //   System.out.println(b%a);
    //   System.out.println(b/a);
    //   a++;
    //   System.out.println(a);
    //   b++;
    //   System.out.println(b);
    //   System.out.println(++a);
    //   System.out.println(++b);


    // Assignment opertator

    int x = 20;
    int y = 10;
    System.out.println(x);
    System.out.println(y);

    System.out.println(x+=20);
    System.out.println(y+=30);
    System.out.println(x-=10);
    System.out.println(x*=2);

    // logical operator
    String s = "banana";
    if (s != null && s.length() < 100) {
       System.out.println("Invalid"); 
    }else{
        System.out.println("Valid");
    }
 
    // bit wise operator
    // System.out.println(2 & 4);
    // System.out.println(2 ^ 3);
    // System.out.println(2 | 4);
    // System.out.println(~4);
    // int h = 3;
    // System.out.println(h << 1);
    // System.out.println(h >> 1);
    // int m = -1;
    // System.out.println(m << 1);

    
    }
}
