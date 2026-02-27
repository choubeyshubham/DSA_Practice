package data.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class ValidParenthsis {
    void main() {
        String s1 = "()[]{}"; // Example 1
        System.out.println("\"" + s1 + "\" is valid: " + isValid(s1)); // Output: true

        String s2 = "([{}])"; // Example 2
        System.out.println("\"" + s2 + "\" is valid: " + isValid(s2)); // Output: true

        String s3 = "(]"; // Example 3
        System.out.println("\"" + s3 + "\" is valid: " + isValid(s3)); // Output: false

        String s4 = "{[]}"; // Example 4
        System.out.println("\"" + s4 + "\" is valid: " + isValid(s4)); // Output: true
    }


    public static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                char ch = map.isEmpty() ? '#' : st.pop();
                if(ch!=map.get(c))
                    return false;
            }else
                st.push(c);
        }
        return true;
    }


    public static boolean is(String s){
        Map<Character, Character> map= new HashMap<>();
        Stack<Character> st=new Stack<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                char ch=map.isEmpty()? '#':st.pop();
                if(ch !=map.get(c)) return false;
                else st.push(c);
            }
        }
        return false;


    }

}
