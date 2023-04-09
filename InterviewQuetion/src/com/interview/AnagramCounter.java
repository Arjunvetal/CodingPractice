package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCounter {
    
    public static int countingAnagrams(String str) {
        String[] words = str.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (map.containsKey(sorted)) {
                if (map.get(sorted) == 1) {
                    count++;
                }
                map.put(sorted, map.get(sorted) + 1);
            } else {
                map.put(sorted, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "a c b c run urn urn";
        System.out.println(countingAnagrams(str)); // Output: 2
    }
}