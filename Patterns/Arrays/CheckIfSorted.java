import java.util.ArrayList;

class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

==Explanation 

Start from index 1
Compare each element with the previous one
If any element is smaller → array is not sorted
If loop finishes → array is sorted
