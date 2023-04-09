import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		CountVowels(str);

	}

	private static void CountVowels(String str) {
		
		str.toLowerCase();
		char[] arr=str.toCharArray();
		
		int vowels=0;
		int consonent=0;
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				vowels++;
			else
				consonent++;
		}
		System.out.println("Vovels ==> "+vowels +"Consonet ==>"+consonent );
		
	}

}
