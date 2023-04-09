import java.util.Scanner;

public class FirstLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {5,1,4,3,2,1,5,-1};
		
		int target=sc.nextInt();
		
		int findex=0;
		int lindex=0;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				if(!found) {
				findex=i;
				lindex=i;
				found=true;
				}
				else
					lindex=i;
			}
			
				
		}
		if(!found)
			System.out.println("element does not exist");
		else
			System.out.println("first index "+findex+" lastindex is "+lindex);

	}

}
