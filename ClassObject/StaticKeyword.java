package ClassObject;

public class StaticKeyword {
   String name;
   int id;
   private static int playerCount = 0;

   StaticKeyword(String name){
      this.name = name;
      id = ++playerCount;
   }

   void printDetails(){
      System.out.println(" id " + id + " name "+ name);
   }

   // static memeber
   static int getPlayer(){
     return playerCount;
   }

   public static void main(String[] args) {
      StaticKeyword s = new StaticKeyword("mahfooz");
      StaticKeyword t = new StaticKeyword("Aman");
      StaticKeyword m = new StaticKeyword("Raj");
      StaticKeyword h = new StaticKeyword("Prakash");
      s.printDetails();
      t.printDetails();;
      m.printDetails();;
      h.printDetails();

      System.out.println(StaticKeyword.playerCount);
      System.out.println(StaticKeyword.getPlayer());

    
      /*
       * key fact about static keyword
       * 1. static method access without creating object
       * 2. static method can not acces non static member
       * 3. non static method can acces static member
       * 4. static method have do not access of this refrence
       * 
       */
   }
}
