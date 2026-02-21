package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

    void main() {
        String s1 = "geeks";
        String s2 = "seekg";
        String s3 = "allergy";
        String s4 = "allergyy";

        System.out.println(anagramHashMap(s1, s2));
        System.out.println(anagramHashMap(s3, s4));


    }

    public static boolean anagramBrute(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        return Arrays.equals(s1Arr, s2Arr);
    }

    public static boolean anagramHashMap(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : s2.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        for(var p:map.entrySet()){
            if(p.getValue()!=0)
                return false;
        }
        return true;
    }


}
