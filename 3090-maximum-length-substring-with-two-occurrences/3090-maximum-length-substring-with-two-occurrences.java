import java.util.HashMap;

class Solution {
    public int maximumLengthSubstring(String s) {

        HashMap<Character, Integer> mp = new HashMap<>();

        int maxx = 0;
        int id = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            while (mp.get(ch) > 2) {

                char leftChar = s.charAt(id);

                mp.put(leftChar, mp.get(leftChar) - 1);

                id++;
            }

            maxx = Math.max(maxx, i - id + 1);
        }

        return maxx;
    }
}