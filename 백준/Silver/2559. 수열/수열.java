import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] inputInfo = scanner.nextLine().split(" ");
		String[] inputTemp = scanner.nextLine().split(" "); 
		scanner.close();
		
		int k = Integer.parseInt(inputInfo[1]);
		int[] temperature = new int[Integer.parseInt(inputInfo[0])];
		int max= Integer.MIN_VALUE;
		int temp = 0;
		
		for(int i=0; i<temperature.length; i++) {
			temperature[i] = Integer.parseInt(inputTemp[i]);
		}
		
		for(int i=0; i+k-1<temperature.length; i++) {
			temp = 0;
			for(int j=i; j<i+k; j++) {
				temp += temperature[j];
			}
			max = (max < temp)? temp : max;
		}
		
		System.out.println(max);
	}

}
