import java.util.HashSet;

public class MissingArray {

	public static void main(String[] args) {

		int arr[]= {2,4,1,1,7,8,0};  //3,6,5
		missing(arr);
		
	}

	private static void missing(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		for(int j=0;j<arr.length;j++) {
			if(!set.contains(j)) {
				System.out.println(j);
			}
		}
		
	}

}
