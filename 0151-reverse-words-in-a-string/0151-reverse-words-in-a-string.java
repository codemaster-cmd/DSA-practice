class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        List<String> list = new ArrayList<>();

        for(String part:arr){
            if(!part.isEmpty()){
                list.add(part);
            }
        }

        Collections.reverse(list);
        return  String.join(" ",list).toString();
        
    }
}