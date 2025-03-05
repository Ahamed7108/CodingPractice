package leetcode;

public class Anagram {
    public static void main(String[] args) {

        String s1="allergy";
        String s2="allergic";
        int[] charCount = new int[26]; // Assuming only lowercase letters

        // Count occurrences in first string
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Decrement count for each character in the second string
        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
            // If at any point a count goes below zero, strings are not anagrams
            if (charCount[c - 'a'] < 0) {
                return;
            }
        }

        // If all counts are zero, strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return ;
            }
        }
        System.out.println("Anagram");
    }
}
