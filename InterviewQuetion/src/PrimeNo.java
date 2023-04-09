import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkPrime(n);
		
//		for(int i=2;i<n/2;i++) {
//			if(n%i==0) {
//				System.out.println(n+"  is not a prime number");
//				break;
//			}
//			else
//				System.out.println(n+"  is a prime number");
//				
//		}

	}

	private static void checkPrime(int n) {
		// TODO Auto-generated method stub
		boolean check=false;
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				check=true;
			}
		}
		
		if(check) {
			System.out.println(n+"  is not a prime number");
		}else
			System.out.println(n+"  is a prime number");
		
	}

}
