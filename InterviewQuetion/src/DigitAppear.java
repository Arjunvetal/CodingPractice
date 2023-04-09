import java.util.Scanner;

public class DigitAppear {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input the number
		int d = scn.nextInt(); //input the digit

        int x = countDigitFreq(n,d);
		System.out.println("The digit " + d + " occurs " + x + " times in " + n);

	}

	private static int countDigitFreq(int n, int d) {
		
		if(n==0 && d==0) return 1;
		
		if(n<0)
			n=-n;
		
		int count=0;
		while(n!=0) {
			int dig=n%10;
			if(d==dig) count++;
			n=n/10;
			
		}
		return count;
	}
	
	

}
