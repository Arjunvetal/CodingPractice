import java.util.Scanner;


//Binary search
public class FindArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,8,9,11,19,20,25};
		
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		
		System.out.println(FindIndex(arr, target));
		
		

	}
	
	public static int FindIndex(int[] arr,int target) {

		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2
;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else
				high=mid-1;
				
		}
		return low;
	}

}
