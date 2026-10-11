class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(n % i ==  0){
                arr.add(nums[i-1]);
            }

        }

        for(int i=0; i<arr.size(); i++){
            sum += (arr.get(i) * arr.get(i));
        }

        return sum;
        
    }
}