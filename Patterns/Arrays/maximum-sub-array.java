//maximum subarray
// Pattern Steps
// 1.Keep a running sum
// 2,Add current element
// 3.Update answer
// 4.If sum becomes negative → reset


class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
