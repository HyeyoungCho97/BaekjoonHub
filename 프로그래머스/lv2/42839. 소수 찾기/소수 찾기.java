import java.util.*;
class Solution {
    
    Set<Integer> numSet = new HashSet<>();
    String number;
    boolean[] visit;
    
    public boolean isPrime(int num){
         for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public int countPrime(){
        
        int cnt=0;
        for(int num: numSet){
            if (num==0 || num==1) continue;
            if(isPrime(num)) {
               //System.out.println(num + " is prime");
                cnt++;
            }
        }
        
        return cnt;
    }
    public void makeNum(String temp, int curr){
        
        if(!"".equals(temp))numSet.add(Integer.parseInt(temp));
        
        if(curr==number.length()){
            return;
        }
        
        for(int i=0; i<number.length(); i++){
            if(visit[i]==true) continue;
            visit[i]=true;
            makeNum(temp+number.charAt(i), curr+1);
            visit[i]=false;
       }
        
    }
    
    public int solution(String numbers) {
        
        number= numbers;
        visit= new boolean[numbers.length()];
        
        makeNum("", 0);
        int answer= countPrime();

        return answer;
    }
}