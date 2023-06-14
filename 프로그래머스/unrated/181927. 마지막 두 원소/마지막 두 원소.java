class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int aIdx =0;
        for(int num: num_list) answer[aIdx++]=num;
        
        if(answer[aIdx-1] > answer[aIdx-2]) answer[aIdx] = answer[aIdx-1] - answer[aIdx-2];
        else answer[aIdx] = answer[aIdx-1] *2;
        
        return answer;
    }
}