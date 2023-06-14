import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        String[] answer = new String[st.countTokens()];
        int aIdx=0;
        while(st.hasMoreTokens()){
            answer[aIdx++] = st.nextToken();
        }
        return answer;
    }
}