package data.Heap;

import data.Node;

import java.util.ArrayList;
import java.util.List;

public class MergeKSorted {
/*
Given k sorted linked lists of different sizes, we need to merge them into a single list while maintaining their sorted order.
 */


    void main() {
        List<Node> arr = new ArrayList<>();

        arr.add(new Node(1));
        arr.get(0).next = new Node(3);
        arr.get(0).next.next = new Node(5);
        arr.get(0).next.next.next = new Node(7);

        arr.add(new Node(2));
        arr.get(1).next = new Node(4);
        arr.get(1).next.next = new Node(6);
        arr.get(1).next.next.next = new Node(8);

        arr.add(new Node(0));
        arr.get(2).next = new Node(9);
        arr.get(2).next.next = new Node(10);
        arr.get(2).next.next.next = new Node(11);

        Node head = mergeKLists(arr);

        printList(head);


    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
    }
    public static Node mergeKLists(List<Node> arr){
        Node res=null;
        for(Node node:arr)
            res=mergeTwo(res,node);
        return res;
    }
    public static Node mergeTwo(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node curr = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if (head1 != null) curr.next = head1;
        else curr.next = head2;
        return dummy.next;
    }

}
