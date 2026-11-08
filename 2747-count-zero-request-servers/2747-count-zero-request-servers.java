class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, Comparator.comparingDouble(o -> o[1]));

        int q = queries.length;
        int m = logs.length;
        int result[] = new int[q];

        int timeIdx[][] = new  int[q][2];

        for(int i=0; i<q; i++){
            timeIdx[i][0] = i; // idx
            timeIdx[i][1] = queries[i]; // time
        }

        Arrays.sort(timeIdx  , Comparator.comparingDouble(o ->o[1]));  // sort  on basis of time

        HashMap<Integer , Integer> mp = new HashMap<>();

        int i=0;
        int j=0;

        for(int[] pair : timeIdx){
            int idx = pair[0];
            int time = pair[1];

            int start = time - x;
            int end = time;

            // expansion
            while(j < m && logs[j][1] <= end){
                int serverId = logs[j][0];
                mp.put( serverId , mp.getOrDefault(serverId , 0) + 1);
                j++;
            }

            // shrink
            while(i < m && logs[i][1] < start){
                int serverId = logs[i][0];
                mp.put(serverId ,  mp.get(serverId) - 1);

                if(mp.get(serverId) ==  0){
                    mp.remove(serverId);

                }
                i++;

            }

            result[idx] = n - mp.size();
        }

        return result;
        
    }
}