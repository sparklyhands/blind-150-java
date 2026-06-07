import java.util.*;

public class TwoSumSolution {

    /**
     * LeetCode Problem: #1 — Two Sum
     *
     * Time Complexity:  O(n)
     *   - We scan the array once.
     *   - HashMap operations (containsKey, put, get) are O(1) average.
     *
     * Space Complexity: O(n)
     *   - In the worst case, we store all elements in the HashMap.
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};  // no solution case
    }

    // -----------------------------
    // Main method with test cases
    // -----------------------------
    public static void main(String[] args) {

        TwoSumSolution sol = new TwoSumSolution();

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test 1: " + Arrays.toString(sol.twoSum(nums1, target1)));
        // Expected: [0, 1]

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Test 2: " + Arrays.toString(sol.twoSum(nums2, target2)));
        // Expected: [1, 2]

        // Test Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Test 3: " + Arrays.toString(sol.twoSum(nums3, target3)));
        // Expected: [0, 1]

        // Test Case 4 (no solution)
        int[] nums4 = {1, 2, 3};
        int target4 = 10;
        System.out.println("Test 4: " + Arrays.toString(sol.twoSum(nums4, target4)));
        // Expected: []
    }
}
