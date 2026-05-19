package data.String;

import java.util.HashSet;
import java.util.Set;


public class LongestSubstring {
    void main() {

        String s = "geeksforgeeks";
        System.out.println(subString(s));//7

        String s2 = "bbbbb";
        System.out.println( subString(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println( subString(s3)); // Output: 3
    }


   public static int subString(String s){
        Set<Character> set=new HashSet<>();
        int left=0;
        int max=0;
        for(int rt=0;rt<s.length();rt++){
            while(set.contains(s.charAt(rt))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(rt));
            max=Math.max(max,rt-left+1);
        }
        return max;
   }

}



