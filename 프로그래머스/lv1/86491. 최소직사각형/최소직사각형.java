import java.util.*;
class Solution {
    public int solution(int[][] sizes) {

        int maxW=Integer.MIN_VALUE;
        int maxH=Integer.MIN_VALUE;
        for(int[] s: sizes){
            Arrays.sort(s);
            maxW= (s[0] >maxW)? s[0]: maxW;
            maxH= (s[1] >maxH)? s[1]: maxH;
        }
        return maxW*maxH;
    }
}