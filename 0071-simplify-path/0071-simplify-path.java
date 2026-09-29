
class Solution {
    public String simplifyPath(String path) {

        // split string basis on delimeter("/")
        String[] tokens = path.split("/");
        Stack<String> st = new Stack<>();

        for (String token : tokens) {

            if (token.equals("") || token.equals(".")) {
                continue;
            }

            if (!token.equals("..")) {
                st.push(token);
            } 
            else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        String result = "";

        // help to  arrange   string in correct order   bcz st.pop return top value
        while (!st.isEmpty()) {
            result = "/" + st.peek() + result;
            st.pop();
        }

        return result;
    }
}