// Problem: Second Largest Element in Array
// Platform: DSA Practice
// Difficulty: Easy

// Approach 1: Brute Force (Sorting)
// Time Complexity: O(n log n)
// Space Complexity: O(1)

import java.util.Arrays;

class Solution {

    // Brute Force Approach
    public int secondLargestBrute(int[] nums) {

        Arrays.sort(nums); // sort array

        int largest = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                return nums[i];
            }
        }

        return -1;
    }

    // Optimal Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int secondLargestOptimal(int[] nums) {

        int largest = nums[0];
        int secondLargest = -1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }

            else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }
}
