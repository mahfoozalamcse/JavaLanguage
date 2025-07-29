package ClassObject;

public class ClassObject1 {
    int real, image;
    public void print(){
        System.out.println(real + " +i"+ image);
    }
    ClassObject1(int r, int i){
        real = r;
        image = i;
    }

    public void add(ClassObject1 c){
        real = real + c.real;
        image = image + c.image;
    }

    public static void main(String[] args) {
     ClassObject1 c1 = new ClassObject1(10, 20);
     c1.print();
     
     ClassObject1 c2 = new ClassObject1(30, 40);
     c2.print();

     c1.add(c2);
     c1.print();
    }
}
