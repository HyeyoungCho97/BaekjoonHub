import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answer_idx=0;
        //commands 반복수행
        for(int[] c: commands){
            int[] temp = new int[c[1]-c[0]+1];
            int temp_idx=0;
            for(int i=c[0]-1; i<c[1]; i++){
                temp[temp_idx++]=array[i];
            }
            Arrays.sort(temp);

            answer[answer_idx++]=temp[c[2]-1];
            
        }
        return answer;
    }
}