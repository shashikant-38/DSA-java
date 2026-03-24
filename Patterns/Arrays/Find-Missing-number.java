class Solution {
    public int missingNumber(int[] nums) {
          int n = nums.length;
        
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}


//logic 
// actual  sum [3,0,1] = 4
//     expected is 6
// hence 6-4=2 found
