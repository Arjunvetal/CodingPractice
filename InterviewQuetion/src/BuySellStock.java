
public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,6,4,3,1,22};
		
		Profit(arr);
		optimize(arr);
		

	}

	private static void optimize(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			maxProfit=Math.max(maxProfit, arr[i]-min);
		}
		System.out.println(maxProfit);
		
	}

	private static void Profit(int[] arr) {
		// TODO Auto-generated method stub
		int profit=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]-arr[i]>profit) {
					profit=arr[j]-arr[i];
				}
			}
		}
		System.out.println(profit);
		
	}
	//n2,, nlogn,logn,n,1

}
