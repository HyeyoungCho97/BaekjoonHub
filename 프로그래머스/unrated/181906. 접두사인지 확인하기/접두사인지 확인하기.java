class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int idx=0;
        while(idx<is_prefix.length()){
            if (idx >= my_string.length()) return 0;
            
            if(my_string.toCharArray()[idx]==is_prefix.toCharArray()[idx]){
                idx++;
            }else return 0;
        }
        
        return 1;
    }
}