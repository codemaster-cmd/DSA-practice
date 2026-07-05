class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int n = nums.length;

        int i = 0;
        int j = 0;

        while (j < n) {

            if (nums[j] % 2 == 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }

            j++;
        }

        return nums;
    }
}