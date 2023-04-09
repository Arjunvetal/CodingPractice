import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		printStar(num);
				

	}

	private static void printStar(int num) {
		// TODO Auto-generated method stub
		
		int curr=1;
		int next=0;
		
		for(curr=1;curr<=num;) {
			
			if(curr>next) {
				System.out.print("* ");
				next++;
				continue;
			}
			if(curr==next) {
				System.out.println();
				curr++;
				next=0;
			}
			
		}
	}

}
