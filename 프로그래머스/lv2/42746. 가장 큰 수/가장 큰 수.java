import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        //String 배열로 바꾸기
        String[] strArray = new String[numbers.length];
        for(int i=0;i<numbers.length; i++){
            strArray[i] = numbers[i]+"";
        }
        
        Arrays.sort(strArray, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        
        StringBuilder sb = new StringBuilder();
        for(String s: strArray) sb.append(s);
        String answer =sb.toString();
        
        if(answer.startsWith("0")) return "0";
        return answer;
    }
}