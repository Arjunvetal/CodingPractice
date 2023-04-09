
public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,22,-5,8,6,3,7};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];

			if(arr[i]<min)
				min=arr[i];
	
		}
		
		System.out.println((max-min));

	}

}
