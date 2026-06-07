package arrays;

public class LC125_E_ValidPalindrome {

    /**
     * LeetCode Problem: #125 — Valid Palindrome (Easy)
     *
     * Time Complexity:  O(n)
     *   - Two pointers scan the string once.
     *
     * Space Complexity: O(1)
     *   - No extra data structures proportional to input size.
     */
    public boolean isPalindrome(String s) {

        // 1. Convert to lowercase
        s = s.toLowerCase();

        // 2. Initialize left and right pointers
        int left = 0;
        int right = s.length() - 1;

        // 3. Loop while left < right
        while (left < right) {

            // 4. Move left until alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // 5. Move right until alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // 6. Compare characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            // 7. Move pointers inward
            left++;
            right--;
        }

        // 8. Return true
        return true;
    }

    public static void main(String[] args) {
        LC125_E_ValidPalindrome sol = new LC125_E_ValidPalindrome();

        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car")); // false
        System.out.println(sol.isPalindrome(" ")); // true
    }
}
