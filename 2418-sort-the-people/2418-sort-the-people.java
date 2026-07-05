import java.util.Arrays;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;

        
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++){
            idx[i] = i;
        }

        // Sort indices based on heights (descending)
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);

        // Build answer
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = names[idx[i]];
        }

        return ans;
    }
}