package data;

import java.util.List;

public class MergeList {

    void main() {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        Node result = merge(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static Node merge(Node l1, Node l2) {
        Node dum = new Node(-1);
        Node curr = dum;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null)
            curr.next = l1;
        if (l2 != null)
            curr.next = l2;
        return dum.next;
    }

}
