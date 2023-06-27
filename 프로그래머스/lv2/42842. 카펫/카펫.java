class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = (brown-4)/2;
        
        for(int i=1; i<=sum; i++){
            if(i*(sum-i) == yellow){
                if(i>sum-i){
                    answer[1]=(sum-i)+2;
                    answer[0]=i+2;
                }
                else{
                    answer[1]=i+2;
                    answer[0]=sum-i+2;
                }
            } 
        }
       
        return answer;
    }
}