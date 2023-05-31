import java.util.*;
class Solution {
    public String solution(String rny_string) {
//         StringBuilder sb = new StringBuilder();
        
//         for(int i=0; i<rny_string.length(); i++){
//             if ('m'==rny_string.toCharArray()[i]) {
//             	sb.append("rn");
//             }else sb.append(rny_string.toCharArray()[i]);
//         }
       
        return rny_string.replaceAll("m", "rn");
    }
}