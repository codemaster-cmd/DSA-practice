class Solution {
    public int getDigitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] afterSort = nums.clone();

        Integer[] arr = new Integer[n];

        for(int i=0; i<n; i++){
            arr[i] = nums[i];
        }


        // custom sort 
        Arrays.sort(arr, (num1 , num2) ->{
            int sum1 = getDigitSum(num1);
            int sum2 = getDigitSum(num2);

            if(sum1 == sum2){
                return Integer.compare(num1, num2);
            }

            return Integer.compare(sum1, sum2);
        });

        HashMap<Integer,Integer> valToIdx = new HashMap<>();

        for(int i=0; i<n; i++){
            valToIdx.put(nums[i] , i);
        }

        int swapCount  = 0;

        for(int i=0; i<n; i++){
            int expectedVal = arr[i];
            int currVal = nums[i];

            if(expectedVal == currVal) continue;

            int idx = valToIdx.get(expectedVal);

            nums[i] = expectedVal;
            nums[idx] = currVal;

            valToIdx.put(currVal , idx);
            valToIdx.put(expectedVal , i);

            swapCount++;

            
        }

        return swapCount;
        
        
    }
}