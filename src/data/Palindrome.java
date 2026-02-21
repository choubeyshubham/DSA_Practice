package data;

public class Palindrome {

    void main() {
        String s = "level";
        if (isPalindrome(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
    }

    static boolean isPalindrome(String s) {
        String ch=s.toLowerCase().replaceAll("[^A-z0-9]","");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

}
