
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,22,55,66,78,88};
		int target=22;
		int index=search(arr,0,arr.length-1,target);
		System.out.println(index);

	}

	private static int search(int[] arr,int low,int high, int target) {
		
		int mid=low+((high-low)/2);
		
		if(high>=low) {
		
		if(arr[mid]==target)
			return mid;
		
		if(arr[mid]<target) {
			return search(arr,mid+1,high,target);
		}
		
		if(arr[mid]>target) {
			return search(arr,low,mid-1,target);
		}
	}
		
		return -1;
		
	}

}
