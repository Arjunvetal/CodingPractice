import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		Count(str);
		usetree(str);
				

	}
	public static void usetree(String str) {
		Map<Character,Integer> map=new TreeMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	}

	private static void Count(String str) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		Set<Entry<Character, Integer>> set=map.entrySet();
		List<Entry<Character, Integer>> list=new ArrayList<Entry<Character, Integer>>(set);
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(Entry<Character, Integer> entry:list) {
			System.out.println("The frequency of occurance "+entry.getKey() +" "+entry.getValue());
		}
		
		System.out.println(map);
	}

}

