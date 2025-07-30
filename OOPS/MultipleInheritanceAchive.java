package OOPS;
// use interface to implement multiple inheritance
interface H {
   void show();    
}
interface M{
    void display();
}

class C implements H, M{
    public void show(){
        System.out.println(" Show me.. ");
    }

    public void display(){
        System.out.println(" Display me.. ");
    }
}
public class MultipleInheritanceAchive {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();

    }
}
