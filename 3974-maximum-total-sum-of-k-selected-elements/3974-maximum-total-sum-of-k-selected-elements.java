class Solution {
    public long maxSum(int[] nums, int k, int mul) {

        Arrays.sort(nums);

        int n = nums.length;
        long totalSum = 0;

        for (int i = n - 1; i >= n - k; i--) {

            if (mul > 0) {
                totalSum += (long) nums[i] * mul;
                mul--;
            } else {
                totalSum += nums[i];
            }
        }

        return totalSum;
    }
}