import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int k1 = 0;
        int k2 = 0;

        // First two operations
        arr1[k1++] = nums[0];
        arr2[k2++] = nums[1];

        // Remaining elements
        for (int i = 2; i < n; i++) {

            if (arr1[k1 - 1] > arr2[k2 - 1]) {
                arr1[k1++] = nums[i];
            } else {
                arr2[k2++] = nums[i];
            }
        }

        // Concatenate arr1 and arr2
        int[] arr = new int[n];

        int index = 0;

        for (int i = 0; i < k1; i++) {
            arr[index++] = arr1[i];
        }

        for (int i = 0; i < k2; i++) {
            arr[index++] = arr2[i];
        }

        return arr;
    }
}