public class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        // If the lengths are not equal, the strings cannot be anagrams
        if (n != m) {
            return false;
        }

        // Initialize an array to store the frequency of each character in the first string
        int[] charCount = new int[26];

        // Count the frequency of each character in the first string
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check the frequency of each character in the second string
        for (char c : t.toCharArray()) {
            // If a character in the second string is not present in the first string,
            // or its frequency is already zero, the strings are not anagrams
            if (charCount[c - 'a'] < 1) {
                return false;
            }

            // Decrement the frequency of the character in the array
            charCount[c - 'a']--;
        }

        // If all characters in the second string are accounted for in the first string,
        // and the frequencies match, the strings are anagrams
        return true;
    }
}
