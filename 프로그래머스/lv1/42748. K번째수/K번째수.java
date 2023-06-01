import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answer_idx=0;
        //commands 반복수행
        for(int[] c: commands){
            
            int[] temp = Arrays.copyOfRange(array, c[0]-1,c[1]);
            
            Arrays.sort(temp);

            answer[answer_idx++]=temp[c[2]-1];
            
        }
        return answer;
    }
}