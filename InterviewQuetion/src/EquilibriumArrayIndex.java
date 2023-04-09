
public class EquilibriumArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {-4,6,2,1,-7,5,3};
		
		Equilibrium(num);

	}

	private static void Equilibrium(int[] num) {
		
		int sum=0;
		for(int i:num) {
			sum+=i;
		}
		
		int currsum=0;
		for(int i=0;i<num.length;i++) {
			
			int index=num[i];
			
			if(sum-currsum-index==currsum) {
				System.out.println("Equilibrium point of array :"+i);
			}
			currsum +=index;
		}
	}

}
