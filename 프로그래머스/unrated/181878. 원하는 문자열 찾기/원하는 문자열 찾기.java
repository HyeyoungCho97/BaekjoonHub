class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        int startIdx = 0;
        int lastIdx = pat.length();
        while(lastIdx <= myString.length()){
            //System.out.println(startIdx+" "+lastIdx);
            if(myString.substring(startIdx, lastIdx).equals(pat)) return 1;
            startIdx ++; lastIdx ++;
        }
        return 0;
    }
}