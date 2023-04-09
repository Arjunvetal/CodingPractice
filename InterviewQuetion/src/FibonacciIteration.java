import java.util.Scanner;

public class FibonacciIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int a=0;
		int b=1;
		
		if(num<0) System.out.println("num cannot be negative");
		
		if(num==0)
			System.out.println(a);
		else if(num==1)
			System.out.println(b);
		
		else {
			int c=0;
			for(int i=2;i<=num;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			
			System.out.println(c);
		}
			
		
		
	}

}
