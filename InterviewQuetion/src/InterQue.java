import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 4, 5, 3, 9, 6, -1, 0, 4, 12, 3, 6, 7, 3, 9, 11, 4, 2, 3, 7, 4, -10, 0, 9, 4, 2, 3, 8, 5};
				 // 1, 2, 4, 5, 3, 4, 9, 6, -1, 0, 12, 3, 4, 6, 7, 3, 4, 9, 11, 2, 3, 4, 7, -10, 0, 9, 2, 3, 8, 5
		
		//1, 2, 4, 5, 3, 4, 9, 6, -1, 0, 12, 3, 4, 6, 7, 3, 4, 9, 11, 2, 3, 4, 7, -10, 0, 9, 2, 3, 8, 5
		//1, 2, 5, 3, 4, 9, 6, -1, 0, 12, 3, 4, 6, 7, 3, 4, 9, 11, 2, 3, 4, 7, -10, 0, 9, 2, 3, 4, 8, 5
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==4)
				continue;
			if(arr[i]==3) {
				list.add(3);
				list.add(4);
			}
			else
				list.add(arr[i]);
			
		}
		System.out.print(list+" ");

	}

}
