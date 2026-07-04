class Solution {
    public boolean isSubsequence(String s, String t) {

        int x = s.length();
        int n = t.length();

       int i = 0;
       int j = 0;

       while(i < x && j < n) {
        if(s.charAt(i)  == t.charAt(j)){
            i++;
        }

        j++;

        }

        return i == x;
        
    }
}