import java.util.stream.*;
import java.util.*;
class Solution {
    public String solution(String[] arr) {
//         StringBuilder sb = new StringBuilder();
//         for(String s: arr) sb.append(s);
        
        return Arrays.stream(arr).collect(Collectors.joining());
    }
}