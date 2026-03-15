// Problem: Largest Element in Array
// Platform: strivers code studio 
// Difficulty: Easy
// Approach: Linear Scan
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int largestElement(int[] nums) {

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}
