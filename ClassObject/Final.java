package ClassObject;

public class Final {
    /*
     * variable(local, instance and class) No re-initialization
     * Method no overriding
     * class no inheritance
     */
    
     // instance final 
     final int y = 10;
     final int z;

     Final(){ // perfectly fine
        z = 30;
     }

     // class or static final
     static final int MAX = 200;

     // static class level
     static final int MIN;
     static{
         MIN = 250;
     }
    public static void main(String[] args) {
       final int x;
       x = 100;
       // x = 200; // give error
       System.out.println();
       System.out.println(x); 

       Final instance = new Final();
       System.out.println(instance.y);

       System.out.println(MAX);

       /*
        * Naming convention
          final and static in capital like MAX, MIN etc.. 
        */

        final StringBuffer sb = new StringBuffer("mahfooz"); // final kyword refrence same memory not change
        sb.append("alam");
        System.out.println(sb);

        // if we rebound with new keyword than give error
       //  sb = new StringBuffer(); // error final not re asighn

    }
    
    // final class A{
        
    // }
    // class Drived extends A{ // give not extend final

    // }
}
