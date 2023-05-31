import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)-0>=97 && a.charAt(i)-0<=122) System.out.print(String.valueOf(a.charAt(i)).toUpperCase());
            else System.out.print(String.valueOf(a.charAt(i)).toLowerCase());
            
        }
    }
}