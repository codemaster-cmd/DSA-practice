class Solution {
    public int minInsertions(String s) {
        int  n = s.length();
        int result = 0;
        int count = 0;
        int i = 0;

        while(i < n){
            if(s.charAt(i) == '('){
                count++;
                i++;
            }else{ // )
                if(count > 0){ // check "(" present or not
                    count--;

                }else{
                    result++; // adding )
                }

                if(i+1 < n && s.charAt(i+1) == ')'){ // check  validity of parenthesis
                    i += 2;
                }else{
                    result++;
                    i++;
                }

            }
        }

        return result + count * 2;

        
    }
}