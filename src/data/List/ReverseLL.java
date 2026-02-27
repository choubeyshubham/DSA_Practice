package data.List;

public class ReverseLL {

    public static Node reverseLL(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    void main(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head = reverse(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

    }

    public static Node reverse(Node head){
        if(head==null|| head.next==null){
            return head;
        }
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }



}
