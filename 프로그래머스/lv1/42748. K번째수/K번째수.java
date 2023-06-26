import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int aIdx=0;
        for(int[] c: commands){
            int[] subArr = new int[c[1]-c[0]+1];
            int idx=0;
            for(int i=c[0]-1; i<c[1];i++) subArr[idx++] = array[i];
            Arrays.sort(subArr);
            answer[aIdx++] = subArr[c[2]-1];
        }
        
        return answer;
    }
}