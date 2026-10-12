class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                st.push(ch);
            }else{
                st.pop();
            }
        }

        while(!st.isEmpty()){
            char c = st.pop();
            result.append(c);
        }

        result.reverse();

        return result.toString();
        
        
    }
}