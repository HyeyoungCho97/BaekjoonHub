import java.util.*;
class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        
        for(char c: my_string.toCharArray()){
            String s = Character.toString(c); 
            if(s.equals(alp))  s = s.toUpperCase();
            sb.append(s);
        }
        return sb.toString();
    }
}