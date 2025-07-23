package Basic3;

class Point{
    int x;
    int y;
}
public class method2 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5; p.y = 10;

     //   fun(p); //in non primitive  pass here refrence change reflected 
     //  System.out.println(" "+ p.x + " "+ p.y); // output 10 10

     
        System.out.println();
        fun2(p);  // here change not reflected due to change refrence
        System.out.println(" "+ p.x + " "+ p.y); // output 5 10
    }

    public static void fun(Point p){
        p.x = 10; p.y = 10;
    }
    // what output
    public static void fun2(Point p){
        p = new Point(); // this have new memory change which not reflect original
        p.x = 10; p.y = 10;
  
    }
}
