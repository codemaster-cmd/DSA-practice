class Solution {
    public int lengthOfLastWord(String s) {
        int n =s.length();
        String[] arr  =  s.split(" ");
        ArrayList<String> list =  new ArrayList<>();

        for(String part : arr){
            if(!part.isEmpty()){
                list.add(part);
            }
        }

        int len = list.get(list.size()-1).length();
        return len;
        
    }
}