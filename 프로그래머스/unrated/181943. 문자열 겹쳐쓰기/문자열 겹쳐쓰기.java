import java.util.*;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        
        // for(int i=0; i<s; i++) {
        // 	sb.append(Character.toString(my_string.charAt(i)));
        // }
        // sb.append(overwrite_string);
        // for(int j=s+overwrite_string.length(); j<my_string.length(); j++) {
        // 	sb.append(Character.toString(my_string.charAt(j)));
        // }
        sb.append(my_string.substring(0,s));
        sb.append(overwrite_string);
        sb.append(my_string.substring(s+overwrite_string.length(), my_string.length()));
        
        
        return sb.toString();
    }
}