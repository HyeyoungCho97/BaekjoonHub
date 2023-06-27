import java.util.*;
class Solution {
    public int solution(int[] citations) {
        //0, 1, 3, 5, 6
        Arrays.sort(citations);
        int answer=0;
        for(int i=0; i<citations.length; i++){
            int h= citations.length - i;
            if(citations[i]>=h) return h;
        }
        
        return 0;
    }
}