class Solution {
    public int solution(String str1, String str2) {
        
        int startIdx=0;
        int lastIdx=str1.length();
        while(lastIdx <= str2.length()){
            if(str1.equals(str2.substring(startIdx, lastIdx))) return 1;
            startIdx++; lastIdx++;
        }
        return 0;
    }
}