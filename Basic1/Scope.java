package Basic1;

public class Scope {
    static int x = 11;
    private int y = 23;
    public void test1(int x){
        Scope t = new Scope();
        // this.x = 22;

        y = 33;
       // System.out.println("Scope.x: " + this.x);
       // System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);

    }
    {
        // scope within brackets
        int x = 20;
        System.out.println(x);

    }
   
    public static void main(String[] args) {
        Scope t = new Scope();
        t.test1(5); 

        for (int x = 0; x < args.length; x++) {
            System.out.println(x);
        }
       
        // give global excess 
        System.out.println(x);
    
     }
}
