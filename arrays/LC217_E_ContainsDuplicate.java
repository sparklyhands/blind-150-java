import java.util.*;

public class ContainsDuplicateSolution {

    /**
     * LeetCode Problem: #217 — Contains Duplicate
     *
     * Time Complexity:  O(n)
     *   - We scan the array once.
     *   - HashSet operations (contains, add) are O(1) average.
     *
     * Space Complexity: O(n)
     *   - In the worst case, all elements are unique and stored in the HashSet.
     */
    public boolean containsDuplicate(int[] nums) {

        // A HashSet stores only unique values.
        Set<Integer> visited = new HashSet<>();

        // Loop through each number in the array
        for (int num : nums) {

            // If we've seen this number before → duplicate found
            if (visited.contains(num)) {
                return true;
            }

            // Otherwise add it to the set
            visited.add(num);
        }

        // If we finish the loop with no duplicates
        return false;
    }

    // Main method with test cases
    public static void main(String[] args) {
        ContainsDuplicateSolution sol = new ContainsDuplicateSolution();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(sol.containsDuplicate(nums1)); // Expected: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(sol.containsDuplicate(nums2)); // Expected: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(sol.containsDuplicate(nums3)); // Expected: true
    }
}
