package data;

public class RemoveNthFromEnd {

    void main(){
        // Example: 1->2->3->4->5 , n = 2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        printList(head);

        head = remove(head, 2);

        printList(head);

    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;

        }
        System.out.println();
    }

    public static Node remove(Node head,int k){
        Node dum=new Node(0);
        dum.next=head;

        Node fast=dum;
        Node slow=dum;

        for(int i=0;i<=k;i++){
            fast=fast.next;
        }
        while(fast !=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;

        return dum.next;
    }



}
