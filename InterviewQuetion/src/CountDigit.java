import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		
		if(num==0)
			System.out.println(1);
		
		if(num<0)
			System.out.println(-1);
		
		else {
			int count=0;
			while(num!=0) {
				num=num/10;
				count++;
			}
			System.out.println(count);
		}
				
		
		
	}

}
