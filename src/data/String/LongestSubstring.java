package data.String;

import java.util.Arrays;

public class LongestSubstring {
    void main() {

        String s1 = "abcabcbb";
        System.out.println("Input: " + s1 + ", Output: " + method(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println("Input: " + s2 + ", Output: " + method(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println("Input: " + s3 + ", Output: " + method(s3)); // Output: 3
    }


    public static int method(String s) {
        int[] arr = new int[128];
        Arrays.fill(arr, -1);
        int len = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (arr[ch] != -1 && arr[ch] >= left) {
                left = arr[ch] + 1;
            }
            arr[ch] = right;
            len = Math.max(len, right - left + 1);
        }


        return len;
    }

}



