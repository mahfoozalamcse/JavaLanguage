package PracticePart2;

import java.util.*;

public class StringPractice {

    // 1. Print and Basic Methods
    static void basicStringOps() {
        String str = "Google Interview";

        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Char at 3: " + str.charAt(3));
        System.out.println("Substring(0,6): " + str.substring(0, 6));
        System.out.println("Contains 'view': " + str.contains("view"));
        System.out.println("Starts with 'Goo': " + str.startsWith("Goo"));
        System.out.println("Ends with 'view': " + str.endsWith("view"));
        System.out.println("Index of 'e': " + str.indexOf('e'));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replace: " + str.replace("Interview", "Prep"));
        System.out.println("Trim: '" + "   hello ".trim() + "'");
    }

    // 2. Compare Strings
    static void compareStrings() {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b : " + (a == b));        // same pool reference
        System.out.println("a == c : " + (a == c));        // different object
        System.out.println("a.equals(c): " + a.equals(c)); // value comparison
    }

    // 3. Reverse String
    static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    // 4. Check Palindrome
    static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    // 5. Count Vowels and Consonants
    static void countVowels(String s) {
        int v = 0, c = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }

    // 6. Count Frequency of Characters
    static void charFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (ch != ' ')
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character Frequency: " + freq);
    }

    // 7. Check if Two Strings are Anagrams
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // 8. Remove Duplicates
    static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }
        return sb.toString();
    }

    // 9. Count Words in a Sentence
    static int countWords(String s) {
        if (s == null || s.trim().isEmpty())
            return 0;
        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    // 10. Longest Word in Sentence
    static String longestWord(String s) {
        String[] words = s.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }
        return longest;
    }

    // 11. Using StringBuilder (Efficient Mutable String)
    static void stringBuilderOps() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.delete(0, 1);
        sb.reverse();
        System.out.println("StringBuilder Result: " + sb);
    }

    // 12. Count Occurrence of Each Word
    static void wordFrequency(String s) {
        String[] words = s.toLowerCase().split("\\W+");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (!w.isEmpty())
                freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        System.out.println("Word Frequency: " + freq);
    }

    public static void main(String[] args) {
        System.out.println("Java String Practice (Google/FAANG)");

        // 1. Basic Ops
        System.out.println("\nQ1: Basic String Methods");
        basicStringOps();

        // 2. Comparison
        System.out.println("\nQ2: Compare Strings");
        compareStrings();

        // 3. Reverse
        System.out.println("\nQ3: Reverse 'Google' → " + reverse("Google"));

        // 4. Palindrome
        System.out.println("\nQ4: 'level' Palindrome? " + isPalindrome("level"));

        // 5. Count Vowels
        System.out.println("\nQ5: Count Vowels in 'Java Developer'");
        countVowels("Java Developer");

        // 6. Character Frequency
        System.out.println("\nQ6: Char Frequency in 'google'");
        charFrequency("google");

        // 7. Anagram
        System.out.println("\nQ7: 'listen' & 'silent' are anagrams? " + isAnagram("listen", "silent"));

        // 8. Remove Duplicates
        System.out.println("\nQ8: Remove Duplicates from 'programming' → " + removeDuplicates("programming"));

        // 9. Count Words
        System.out.println("\nQ9: Word Count → " + countWords("Google prepares you for interviews"));

        // 10. Longest Word
        System.out.println("\nQ10: Longest Word → " + longestWord("Google prepares developers"));

        // 11. StringBuilder
        System.out.println("\nQ11: StringBuilder Operations");
        stringBuilderOps();

        // 12. Word Frequency
        System.out.println("\nQ12: Word Frequency Example");
        wordFrequency("Java is great and Java is powerful");
    }
}



