import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> com=new Comparator<Integer>() {
			
			public int compare(Integer i,Integer j) {
				if(i%10>j%10)
					return 1;
				else
					return -1;
			}
		};
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(24);
		list.add(5);
		list.add(99);
		
		Collections.sort(list,com);
		System.out.println(list);

	}

}
