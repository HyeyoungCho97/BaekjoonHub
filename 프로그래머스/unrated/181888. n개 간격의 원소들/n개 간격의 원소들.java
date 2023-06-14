class Solution {
    public int[] solution(int[] num_list, int n) {
        int answerLength = (num_list.length%n != 0)? num_list.length/n+1: num_list.length/n;
        int[] answer = new int[answerLength];
        int aIdx=0;
        for(int i=0; i<num_list.length; i+=n){
            answer[aIdx++] = num_list[i];
        }
        return answer;
    }
}