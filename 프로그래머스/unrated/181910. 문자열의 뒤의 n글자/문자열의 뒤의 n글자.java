import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        char[] mychar = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=mychar.length-n ; i<mychar.length ; i++ ){
            sb.append(Character.toString(mychar[i]));
        }
        return sb.toString();
    }
}