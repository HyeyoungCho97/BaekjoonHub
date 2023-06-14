import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabetCounter = new int [26];
		
		for(char c: br.readLine().toCharArray()) {
			alphabetCounter[c-97] += 1;
		}
		
		for(int a: alphabetCounter) {
			System.out.print(a+" ");
		}
		

	}

}
