import java.util.*;

public class ValidAnagramSolution {

    public boolean isAnagram(String s, String t) {

        // 1. Length check
        if (s.length() != t.length()) {
            return false;
        }

        // 2. Frequency array
        int[] freq = new int[26];

        // 3. Count characters in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // 4. Subtract characters in t
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;  // t has extra characters
            }
        }

        // 5. Final check: all counts must be zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagramSolution sol = new ValidAnagramSolution();

        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));         // false
    }
}
