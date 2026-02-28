package data.Stack;

import java.util.Stack;

public class MinStack {
    /*
🧩 Min Stack
Design a stack that supports:
push(x)
pop()
top()
getMin()
All in O(1) time complexity.

     */
    private static Stack<Integer> mainStack;
    private static Stack<Integer> minStack;
    public MinStack(Stack<Integer> mainStack, Stack<Integer> minStack) {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    public static void push(int val){
        mainStack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()) minStack.pop();
    }
    public static void pop(){
        if(mainStack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }
    public static int top(){
        return mainStack.peek();
    }
    public static int getMin(){
        return minStack.peek();
    }


}
