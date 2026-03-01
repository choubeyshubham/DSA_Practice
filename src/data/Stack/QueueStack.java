package data.Stack;

import java.util.Stack;

public class QueueStack {
    /*
🧩 Implement Queue using Stacks
🔎 Problem
Implement a FIFO Queue using only stack operations:
push(x)
pop()
peek()
empty()
     */
    private Stack<Integer> isk;
    private Stack<Integer> osk;

    public QueueStack() {
        isk = new Stack<>();
        osk = new Stack<>();
    }

    public void push(int x) {
        isk.push(x);
    }

    public int pop() {
        shiftif();
        return osk.pop();
    }

    public int peek() {
        shiftif();
        return osk.peek();
    }
    public boolean empty(){
        return isk.isEmpty()&&osk.isEmpty();
    }

    public void shiftif() {
        if (osk.isEmpty()) {
            while (!isk.isEmpty())
                osk.push(isk.pop());
        }
    }


}
