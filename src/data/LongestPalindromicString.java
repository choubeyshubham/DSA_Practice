package data;

public class LongestPalindromicString {

    void main() {

        String s = "forgeeksskeegfor";
        System.out.println(palidromeSubString(s));

    }

    public static String palidromeSubString(String s) {
        int n = s.length();
        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 1; j++) {
                int low = i;
                int high = i + j;

                while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
                    int curr=high-low+1;
                    if(curr>maxLen){
                        start=low;
                        maxLen=curr;
                    }
                    low--;
                    high++;//
                }
            }
        }

    return s.substring(start,start+maxLen);
    }


}
