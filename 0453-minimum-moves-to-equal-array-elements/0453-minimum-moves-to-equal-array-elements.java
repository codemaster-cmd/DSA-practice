class Solution {
    public int minMoves(int[] nums) {
        int cnt = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i< nums.length; i++){
            min = Math.min(nums[i] , min);
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] - min;
        }

        for(int i=0; i<nums.length; i++){
            cnt += nums[i];
        }

        return cnt;
        
    }
}