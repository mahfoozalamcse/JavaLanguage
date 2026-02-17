package ClassObject;

public class Constructor {
    int x, y;
    Constructor(int a, int b){
        x = a;
        y = b;
    }
    void print(){
        System.out.println("x = "+x + ", y = "+ y);
    }
    
    public static void main(String[] args) {
       Constructor c = new Constructor(10, 20);
       c.print(); 

       // defualt without constructor 
    //    Constructor c = new Constructor();
    //    c.print(); // output x = 0, y = 0

    // use constructor without pass any argument
    // Constructor s = new Constructor(); // give error udefined
    // s.print();

    }
}
