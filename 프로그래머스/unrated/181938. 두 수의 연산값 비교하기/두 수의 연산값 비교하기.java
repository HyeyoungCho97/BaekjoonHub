class Solution {
    public int solution(int a, int b) {
        
        int ab = Integer.parseInt(a+""+b);
        int ab2 = 2*a*b;
        
        return (ab >= ab2)? ab: ab2;
    }
}