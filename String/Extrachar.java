package String;

import java.util.Arrays;

public class Extrachar {
    public static void extracharacter(String s1, String s2){
        char[] a = s1.toCharArray();
        Arrays.sort(a);
        char[] b = s2.toCharArray();
        Arrays.sort(b);

        int n = s1.length();
        for(int i=0; i<n; i++){
            if (a[i] != b[i]) {
                System.out.println(" "+ a[i]);
            }
        }
        System.out.println("  "+b[n]);
    }
    // method 2
    public static int extracharacter1(String s1, String s2){
        // assume only lower case 
        // if upper case than convert toLowercase
        int count[] = new int[26];
        int n = s1.length();
        for(int i=0; i<n; i++){
            count[s1.charAt(i)-'a']--;
            count[s2.charAt(i)-'a']++;
        }
        count[s2.charAt(n)-'a']++;
        for(int i=0; i<26; i++){
            if (count[i] == 1) {
                return (char)(i+'a');
            }
        }
        return 0;
    }

    // method 3
    public static int extracharacter2(String s1 , String s2){
        int res = 0;
        int n = s1.length();
        for(int i=0; i<n; i++){
            res = res ^ s1.charAt(i) ^ s2.charAt(i); // xor 1 ^ 1 = 0 and 0 ^ 1 = 1

        }
        res = res ^ s2.charAt(n);
        return (char)(res);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcde";

        System.out.println();
        //extracharacter(s1, s2);
        // System.out.println(extracharacter1(s1, s2));
        System.out.println(extracharacter2(s1, s2));
    }
}
