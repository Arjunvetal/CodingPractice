package com.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveMaxOccu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="azabbccdddee";
		//azabbccee
		String str="asabsbt";
		
		HashMap<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else
				map.put(str.charAt(i), 1);
		}
		
		int max=Collections.max(map.values());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))!=max)
				sb.append(str.charAt(i));
			
		}
		
		System.out.println(sb);
	}

}
