//imp for interview
  //  Brute Force Approach
  // 1.store nonzero in temp(other than 0s)
  // 2count zeros 
  // 3.append all zero at end

import java.util.*;

public class MoveZeros {
    public static void moveZerosBrute(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int num : arr) {
            if (num != 0) {
                temp.add(num);
            }
        }

        int i = 0;
        for (i=0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }
    }

    // 🔹 Optimal Approach (Two Pointer)
    // take i and j 2pointers 
   class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // position for next non-zero
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                j++;
            }
        }
    }
}
