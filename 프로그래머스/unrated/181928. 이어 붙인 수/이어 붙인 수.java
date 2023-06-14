import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();
        
        for(int n: num_list){
            if(n%2==1) oddSb.append(n+"");
            else evenSb.append(n+"");
        }
        return Integer.parseInt(oddSb.toString())+Integer.parseInt(evenSb.toString());
    }
}