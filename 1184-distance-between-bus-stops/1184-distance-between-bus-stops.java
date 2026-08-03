class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int total = 0;
        int forward = 0;

        for (int i = 0; i < distance.length; i++) {
            total += distance[i];

            if (i >= start && i < destination) {
                forward += distance[i];
            }
        }

        return Math.min(forward, total - forward);
    }
}