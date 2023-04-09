import java.util.ArrayList;
import java.util.List;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,7,6,4,8,5,4,1};
		System.out.println(Duplicate(arr));
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	public static List<Integer> Duplicate(int[] arr){
		List<Integer> res=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int index=Math.abs(arr[i])-1;
			//System.out.println("indexxx "+index);
			if(arr[index]<0) {
				res.add(Math.abs(arr[i]));
			}
			arr[index]=-arr[index];
		}
		return res;
	}

}
