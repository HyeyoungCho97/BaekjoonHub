import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] sNums = new String[numbers.length];
        
        for(int i=0; i<sNums.length; i++){
            sNums[i] = numbers[i]+"";
        }
        
        Arrays.sort(sNums, (a, b)-> {
            return (b+a).compareTo(a+b);
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sNums.length; i++){
            if ("0".equals(sNums[0])) return "0";
            sb.append(sNums[i]);
        }
        
        return sb.toString();
    }
}