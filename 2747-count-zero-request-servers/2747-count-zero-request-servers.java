import java.util.*;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        // Sort logs according to request time
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        // Store queries with their original indices
        int[][] q = new int[queries.length][2];

        for (int i = 0; i < queries.length; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }

        // Sort queries according to query time
        Arrays.sort(q, (a, b) -> a[0] - b[0]);

        int[] ans = new int[queries.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        for (int i = 0; i < q.length; i++) {

            int start = q[i][0] - x;
            int end = q[i][0];

            // Add logs within the current time window
            while (right < logs.length && logs[right][1] <= end) {

                map.put(logs[right][0],
                    map.getOrDefault(logs[right][0], 0) + 1);

                right++;
            }

            // Remove logs outside the current time window
            while (left < right && logs[left][1] < start) {

                int id = logs[left][0];

                map.put(id, map.get(id) - 1);

                if (map.get(id) == 0) {
                    map.remove(id);
                }

                left++;
            }

            // Servers with zero requests
            ans[q[i][1]] = n - map.size();
        }

        return ans;
    }
}