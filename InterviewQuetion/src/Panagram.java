import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		System.out.println(isPanagram(str.toLowerCase()));

	}

	private static boolean isPanagram(String str) {
		
		System.out.println(str.length());
		if(str.length()<26) return false;
		
		else {
		for(char c='a';c<='z';c++) {
			if(str.indexOf(c)<0)
				return false;
		 }
		}
		return true;
	}

}
