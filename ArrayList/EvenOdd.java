package ArrayList;

import java.util.ArrayList;

public class EvenOdd {
   public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(10);
      arr.add(11);
      arr.add(31);
      arr.add(40);

      arr.add(21);
      arr.add(23);
      

      ArrayList<Integer> even = new ArrayList<>();
      ArrayList<Integer> odd = new ArrayList<>();

      for(int i=0; i<arr.size(); i++){
        int x = arr.get(i);
        if (x % 2 == 0) {
            even.add(x);
        }else{
            odd.add(x);
        }
      }
      System.out.println();
      System.out.println(" Even = "+even);
      System.out.println(" Odd = "+ odd);

      // find minimum smaller than five
     
      ArrayList<Integer> smaller = new ArrayList<>();
      for(int i=0; i<arr.size(); i++){
        int x = arr.get(i);
        if (x < 34) {
            smaller.add(x);
        }
        
      }

      System.out.println(" Smaller = " +smaller);
   } 
}
