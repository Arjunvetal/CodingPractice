import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		//System.out.println(Gcd(n1,n2));
		System.out.println("GCD with recursion  "+gcd1(n1,n2));

	}

	private static int Gcd(int n1, int n2) {
		
		int result=Math.min(n1, n2);
		
		while(result>0) {
			if(n1%result==0 && n2%result==0)
				break;
			else
				result--;
		}
		return result;
	}
	private static int gcd1(int n1,int n2) {
		
		if(n1==0)
			return n1;
		if(n2==0)
			return n2;
		
		if(n1==n2)
			return n1;
		
		if(n1>n2)
			return gcd1(n1-n2,n2);
		return gcd1(n1,n2-n1);
	}

}
