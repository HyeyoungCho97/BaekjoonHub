import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int aIdx=0;
        //command만큼 반복
        for(int[] c: commands){
            int[] temp = new int[c[1]-c[0]+1];
            int tIdx = 0;
            for(int i=c[0]-1; i<c[1]; i++){
                temp[tIdx++] = array[i];
            }
            Arrays.sort(temp);
            answer[aIdx++] = temp[c[2]-1];
        }
        
        return answer;
    }
}