class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            max = Math.max(num , max);
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = Math.abs(nums[i] - max);
        }

        int moves = 0;
        for(int num : nums){
            moves += num;
        }

        return moves;
        
    }
}