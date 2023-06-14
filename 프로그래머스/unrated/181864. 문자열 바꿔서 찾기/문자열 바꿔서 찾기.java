import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = flipString(myString);
        
        int startIdx=0;
        int lastIdx=pat.length();
        while(lastIdx<=myString.length()){
            if(pat.equals(myString.substring(startIdx,lastIdx))) return 1;    
            startIdx++; lastIdx++;
        }
        
        return 0;
    }
    
    public String flipString (String myString){
        
        StringBuilder sb = new StringBuilder();
        
        for(char c: myString.toCharArray()) {
            if(c=='A') sb.append("B");
            else if(c=='B') sb.append("A");
        }
        
        return sb.toString();
    }
}