package Basic3;

public class method1 {
    // method1
    public static void fun1(){
        System.out.println("Inside fun1");
        fun2();
    }
    // method2
    
    public static void fun2(){
        System.out.println("Inside fun2");
    }
    
    public static void fun(int a, int b){
      System.out.println(a+b);
    }
    // main is also method
    
    public static void main(String[] args) {
        
        fun1();
        fun(12, 23);
        fun(12, 23);

        int x = 5;
        System.out.println(x);
        test(x); // output 5 due to change variable 

        
        
    }
    public static void test(int x){
        x = x + 5;
    }
}
