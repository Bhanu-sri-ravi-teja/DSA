class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character , String> result = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(!result.containsKey(pattern.charAt(i))){
                if (result.containsValue(s.split(" ")[i])) {
                    return false;
                }
                result.put(pattern.charAt(i) , s.split(" ")[i]);
            }else{
                
                if(!s.split(" ")[i].equals(result.get(pattern.charAt(i)))){
                    return false;
                }
            }
        }
        return true;
    }
}