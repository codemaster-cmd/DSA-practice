class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();

        int count = 0;

        int currCount = 1;
        int prevCount = 0;

        s.toCharArray();

        for(int i=1; i<n; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currCount++;
            }else{
                count += Math.min(currCount, prevCount);

                prevCount = currCount;
                currCount = 1;
            }
        }

        return count + Math.min(currCount, prevCount);
        
    }
}