class Solution {
    public int solution(String my_string, String target) {
        
        int startIdx=0;
        int lastIdx= target.length();
        
        while(lastIdx<=my_string.length()){
            if(target.equals(my_string.substring(startIdx, lastIdx))) return 1;
            startIdx++; lastIdx++;
        }
        
        return 0;
    }
}