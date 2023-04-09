package com.interview;
import java.util.*;

public class ArrayCouples{
  public static String ArrayCouples(int[] arr) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i += 2) {
      int a = arr[i];
      int b = arr[i+1];
      map.put(a, b);
    }

    for (int i = 0; i < arr.length; i += 2) {
      int a = arr[i];
      int b = arr[i+1];

      if (map.containsKey(b) && map.get(b) == a) {
        continue;
      } else {
        sb.append(a).append(",").append(b).append(",");
      }
    }

    if (sb.length() > 4) 
	{
      sb.deleteCharAt(sb.length()-1);
    } 
	else 
	{
		sb.setLength(0);
		sb.append("yes");
    }

    return sb.toString();
  }

  public static void main(String[] args) {
   // int[] arr1 = {2,1,1,2,3,3};
   int[] arr2 = {6, 2, 2, 6, 5, 14, 14, 1};
  //  System.out.println(ArrayCouples(arr1)); // output: yes
   System.out.println(ArrayCouples(arr2)); // output: 5,14,14,1
  }
}