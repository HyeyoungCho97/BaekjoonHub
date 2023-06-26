import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        Map<Integer, Integer> lab= new HashMap<>();
       
        for(int n: nums){
            lab.put(n, lab.getOrDefault(n, 0)+1);
        }
        
        // for(int n: lab.keySet()){
        //     System.out.println(n+" "+lab.get(n));
        // }
        //System.out.println(lab.size());
        return (lab.size() < nums.length/2)? lab.size(): nums.length/2;
    }
}