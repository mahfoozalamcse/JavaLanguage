package OOPS;

// Hirerical inheritance

public class HirericalInheritance {
    void greet(){
        System.out.println(" Hii ... ");
    }
}

class Child1 extends HirericalInheritance{
    void talk(){
        System.out.println(" Talking .. ");
    }
}

class Child2 extends HirericalInheritance{
  void play(){
     System.out.println(" Display .. ");
  }
}

class Test{
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.greet();
        c.play();

        Child1 s = new Child1();
        s.talk();
        s.greet();

    }
}
