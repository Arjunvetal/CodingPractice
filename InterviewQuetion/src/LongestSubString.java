import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdabefd";
		Longest(str);

	}

	private static void Longest(String str) {

		String longestOverall="";
		String longestTillNow="";
		
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(set.contains(c)) {
				longestTillNow="";
				set.clear();
			}
			set.add(c);
			longestTillNow+=c;
			
			if(longestTillNow.length()>longestOverall.length()) {
				longestOverall=longestTillNow;
			}
			
		}
		
		System.out.println(longestOverall);
	}

}
