
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int rightSum = 0;
        int count = 0;

        for (int i = n - 1; i >= 1; i--) {
            rightSum += nums[i];

            double avg = (double) rightSum / (n - i);

            if (nums[i - 1] > avg) {
                count++;
            }
        }

        return count;
    }
}
