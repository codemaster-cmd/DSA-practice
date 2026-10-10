class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        int maxDiff = 100000;

        // Count the frequency of each absolute difference
        int[] countDiff = new int[maxDiff + 1];

        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            countDiff[d]++;
        }

        int K = k1 + k2;

        // Reduce the largest differences first
        for (int currDiff = maxDiff; currDiff > 0 && K > 0; currDiff--) {

            int countOps = Math.min(countDiff[currDiff], K);

            countDiff[currDiff] -= countOps;
            countDiff[currDiff - 1] += countOps;

            K -= countOps;
        }

        // Calculate the sum of squared differences
        long result = 0;

        for (long d = 1; d <= maxDiff; d++) {
            result += (long) countDiff[(int) d] * d * d;
        }

        return result;
    }
}