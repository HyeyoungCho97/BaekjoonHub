import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map <String, List<String>> map = new HashMap<>();
        
        for(String[] s: clothes){
            List<String> list = map.getOrDefault(s[1], new LinkedList<String>());
            list.add(s[0]);
            map.put(s[1], list);
        }
        
        for(String s: map.keySet()){
            answer *= map.get(s).size()+1;
        }
        
        return answer-1;
    }
}