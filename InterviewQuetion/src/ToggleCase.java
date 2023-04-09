import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder("");
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
				sb.append((char)(ch+32));
			else if(ch>='a' && ch<='z')
				sb.append((char)(ch-32));
			else 
				sb.append(ch);
		}
		System.out.println(sb.toString());

	}

}
