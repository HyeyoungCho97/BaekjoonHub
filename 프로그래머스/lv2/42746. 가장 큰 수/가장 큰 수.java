import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        String[] sNum = new String[numbers.length];
        int idx=0;
        //String 변환
        for(int i: numbers) sNum[idx++]= i+"";
        
        Arrays.sort(sNum, (s1, s2)-> {return Integer.parseInt(s2+s1) - Integer.parseInt(s1+s2);});
        if("0".equals(sNum[0])) return "0";
        else return String.join("",sNum);
    }
}