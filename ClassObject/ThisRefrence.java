package ClassObject;

public class ThisRefrence {
    // int x, y;
    // ThisRefrence(int a, int b){
    //     x = a;
    //     y = b;
    // }
    
    // void print(){ // there invoked direct
    //     System.out.println(x +"  "+ y);
    // }

    // public static void main(String[] args) {
    //   ThisRefrence t = new ThisRefrence(10, 20);
    //   ThisRefrence s = new ThisRefrence(30,40);
    //   t.print();
    //   s.print();  


//  // 2. internal working of this
//     int x, y;
//     ThisRefrence(int x, int y){ // no need extara variable
//         this.x = x;
//         this.y = y;
//     }
//     void print(){
//         System.out.println(" x = " + x + " y = "+ y);
//     }

//     // its help in chainig for moodification
//     ThisRefrence setX(int x){
//         this.x = x;
//         return this;
//     }
//     ThisRefrence sety(int y){
//         this.y = y;
//         return this;
//     }
//     public static void main(String[] args) {
//        ThisRefrence t = new ThisRefrence(10, 20);
//        t.print(); 
//        t.setX(2).sety(3);
//        t.print();
//     }


   // 3. other way this which not take other parametre
   int x, y;
   ThisRefrence(int x, int y){
    this.x = x;
    this.y = y;

    System.out.println(" x = "+this.x + " y = "+ this.y);
   }
   ThisRefrence(){
    this(10, 20);
   }
   public static void main(String[] args) {
   // ThisRefrence t = new ThisRefrence();

   }
}
