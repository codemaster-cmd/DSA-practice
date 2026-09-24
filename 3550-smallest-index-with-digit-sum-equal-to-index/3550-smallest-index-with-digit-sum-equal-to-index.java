class Solution {
    public int smallestIndex(int[] nums) {
        int minIdx = Integer.MAX_VALUE;
        
        
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int sumIdx = 0;

            while(n > 0){
                sumIdx += n % 10;
                n /= 10;
            }

            if(sumIdx == i){
                minIdx = Math.min(minIdx ,  i);   
            }
        }

        return minIdx == Integer.MAX_VALUE ? -1 : minIdx;
    }
}