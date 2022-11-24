package hacker_ranck.strings;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        int la = a.length();
        int lb = b.length();
        if(la == lb && la > 0 && la < 51) {
            java.util.Map<Character, Integer> aCharCountMap = setValueMap(a.toLowerCase());
            java.util.Map<Character, Integer> bCharCountMap = setValueMap(b.toLowerCase());
            return aCharCountMap.equals(bCharCountMap);
        }
        return false;
    }

    private static java.util.Map<Character, Integer> setValueMap(String str) {
        java.util.Map<Character, Integer> charCountMap = new java.util.HashMap<Character, Integer>();
        char[] bArray = str.toCharArray();
        for (char c : bArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) + 1);
            }else{
                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
