import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		reverseString(str);
		System.out.println(str.length());

	}

	private static void reverseString(String str) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				st.push(str.charAt(i));
			}
			else {
				while(st.empty()==false) {
					System.out.print(st.pop());
				}
			}
			
		}
		System.out.println("length stack "+st.size());
		System.out.print(" ");
		while(st.empty()==false) {
			System.out.print(st.pop()+" ");
		}
		
		
		
	}

}
