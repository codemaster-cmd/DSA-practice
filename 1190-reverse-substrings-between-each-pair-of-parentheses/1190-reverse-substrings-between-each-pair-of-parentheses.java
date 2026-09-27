class Solution {
    public String reverseParentheses(String s) {

        Stack<Integer> lastSkipLength = new Stack<>();

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                lastSkipLength.push(result.length());

            } else if (ch == ')') {

                int l = lastSkipLength.pop();

                StringBuilder temp = new StringBuilder(result.substring(l));
                    

                temp.reverse();

                result.replace(l, result.length(), temp.toString());

            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}