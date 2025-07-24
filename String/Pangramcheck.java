package String;

public class Pangramcheck {
    public static boolean pangram(String str){
        boolean alphabets[] = new boolean[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabets[ch-'a'] = true;
            }
        }
        // check letter is present
        for (boolean present : alphabets) {
            if (!present) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean res = pangram(str);
        System.out.println();
        if (res == true) {
            System.out.println("Is contain all alphabets in a to z");
        }else{
            System.out.println("Not pangram");
        }
    }
}
