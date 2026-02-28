package data.Stack;

import java.util.Stack;

public class PolishNotation {

    public static void main(String[] args) {

        String[] test1 = {"2", "1", "+", "3", "*"};
        System.out.println("Expected 9 | Actual: " + evalRPN(test1));

        String[] test2 = {"4", "13", "5", "/", "+"};
        System.out.println("Expected 6 | Actual: " + evalRPN(test2));

        String[] test3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println("Expected 22 | Actual: " + evalRPN(test3));
    }

    public static int evalRPN(String[] st) {
        Stack<Integer> sk = new Stack<>();
        for (String s : st) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = sk.pop();
                int a = sk.pop();
                switch (s) {
                    case "+":
                        sk.push(a + b);
                        break;
                    case "-":
                        sk.push(a - b);
                        break;
                    case "*":
                        sk.push(a * b);
                        break;
                    case "/":
                        sk.push(a / b);
                        break;
                }
            }else{
                sk.push(Integer.parseInt(s));
            }
        }
        return sk.pop();
    }


}
