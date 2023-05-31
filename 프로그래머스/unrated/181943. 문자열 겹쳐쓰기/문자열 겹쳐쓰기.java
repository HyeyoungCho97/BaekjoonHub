import java.util.*;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s; i++) {
        	sb.append(Character.toString(my_string.charAt(i)));
        }
        sb.append(overwrite_string);
        for(int j=s+overwrite_string.length(); j<my_string.length(); j++) {
        	sb.append(Character.toString(my_string.charAt(j)));
        }
        
        return sb.toString();
    }
}