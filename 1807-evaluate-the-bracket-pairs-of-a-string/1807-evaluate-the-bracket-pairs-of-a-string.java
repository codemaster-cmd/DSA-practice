class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> mp = new HashMap<>();

        for (List<String> pair : knowledge) {
        mp.put(pair.get(0), pair.get(1));
        }

        StringBuilder result =  new StringBuilder();
        StringBuilder temp   =  new StringBuilder();

        boolean isBracketOpen = false;
        String str;

        int i = 0;
        while(i < s.length()){
            if(s.charAt(i)  == '('){
                isBracketOpen = true;
            }else if(s.charAt(i) == ')'){
                isBracketOpen = false;

                str = mp.containsKey(temp.toString()) ? mp.get(temp.toString()) : "?";

                result.append(str);

                temp.setLength(0);

            }else if(isBracketOpen == true){

                temp.append(s.charAt(i));

            }else{
                result.append(s.charAt(i));
            }

            i++;

        }

        return result.toString();


    }
}