
import java.util.*;

public class MoveZeros {

    //  Brute Force Approach
  // 1.store nonzero in temp
  // 1count zeros 
  // 1.append all zero at end
    public static void moveZerosBrute(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int num : arr) {
            if (num != 0) {
                temp.add(num);
            }
        }

        int i = 0;
        for (; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }
    }

    // 🔹 Optimal Approach (Two Pointer)
    public static void moveZerosOptimal(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        int[] arr2 = {0, 1, 0, 3, 12};

        moveZerosBrute(arr1);
        moveZerosOptimal(arr2);

        System.out.println("Brute Force: " + Arrays.toString(arr1));
        System.out.println("Optimal: " + Arrays.toString(arr2));
    }
}
