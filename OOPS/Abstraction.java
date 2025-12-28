package OOPS;

public class Abstraction {
    // abstract class
    // interfaces
    public static void main(String[] args) {
        System.out.println();
      Square s = new Square(5, 10.5);
      System.out.println(" Area is = "+s.getArea());  
    }
}


abstract class Shape{
  int color;
  int getColor(){
     return color;
  }
  Shape(int c){
    color = c;
  }
    
  abstract double getArea();
}

class Square extends Shape{
    double side;
    Square(int c, double s){
      super(c);
      side = s;
    }
  //  @Override
    double getArea() { 
        return side*side;
    }
}
