package OOPS;

public class Polymorphism {
    /*
     * its two type 
     * 1. compile time or static -> method overloading
     * 2. run time or dynamic-> method overriding
     */
    public static void main(String[] args) {
        MethodOverloding m = new MethodOverloding();
        // overloading
        System.out.println();
        System.out.println(m.sum(10, 20));
        System.out.println(m.sum(10, 20, 30));
        System.out.println(m.sum(10.2, 11.2, 12.3, 13.3));

         // test overriding
         Base1 b = new Derived1(); // its possible due to overloading
         //  Derived1 d = new Base1(); // give error not acces
          b.show();


          // more overriding test
          // here work overriding like multilevel inheritance
          Parent3 p1 = new Child3();
          Parent3  c3 = new GrandChild3();
          p1.fun();
          c3.fun();

          // static method not override example
          System.out.println(" static not ovrride.. ");
        //   Parent4 p4 = new Child4();
        //   p4.fun();

        // test super
        Parent5 ps = new Child5();
        ps.fun();
    }
}

class MethodOverloding{
    // method overloading suporting each method same name
    // only on the base of return type not achive alse eg. void print() and int print()
    // not find exact data type than autometic conversion happen easily

    public int sum(int x, int y){
       return x + y;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

    public double sum(double x, double y, double z, double a){
        return x+y+z+a;
    }
}


// method overriding
class Base1{
    void show(){
       System.out.println(" show.. ");
    }
}

class Derived1 extends Base1{
    @Override
    void show(){
        System.out.println(" Play.. "); //they see run time what print also called run time polymorphism achieved
    }
}



// more on method overriding
class Parent3{
    void fun(){
        System.out.println(" I am parent.. ");
    }
}
class Child3 extends Parent3{
    void fun(){
        System.out.println(" I am child");
    }
}

class GrandChild3 extends Child3{
    void fun(){
        System.out.println( " I am grand child..");
    }
}

// static method not overriden here example
class Parent4{
    static void fun(){
        System.out.println(" I am parent");
    }
}

class Child4 extends Parent4{
    static void fun(){
        System.out.println(" I am child");
    }
}
 

// we can also call using super
class Parent5{
     void fun(){
        System.out.println(" I am Parent 5");
    }
}
class Child5 extends Parent5{
    @Override
    void fun(){
        super.fun(); 
        System.out.println(" I am child 5 ");
    }
}
