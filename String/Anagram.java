package String;

import java.util.Arrays;
public class Anagram {
  static final int CHAR = 256;
  // Naive
    public static boolean isAnagram(String s1, String s2){
      if (s1.length() != s2.length()) {
         return false;
      }  
      char a[] = s1.toCharArray();
      Arrays.sort(a);

      char b[] = s2.toCharArray();
      Arrays.sort(b);

      return Arrays.equals(a, b);
 
    }
    // 2. efficient
    public static boolean isAnagram2(String s1, String s2){

      if (s1.length() != s2.length()) {
         return false;
      }
      int count[] = new int[CHAR];
      for(int i=0; i<s1.length(); i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
      }

      for(int i=0; i<256; i++){
        if (count[i] != 0) {
           return false;
        }
      }
      return true;
    }

    
    public static void main(String[] args) {
       String s1 = "listen";
       String s2 = "silent";
       System.out.println();
      // System.out.println(isAnagram(s1, s2));
      System.out.println(isAnagram2(s1, s2));

    }
}
