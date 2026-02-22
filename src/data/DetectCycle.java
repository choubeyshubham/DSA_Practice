package data;

public class DetectCycle {

    public static boolean hasCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node slow=head;
        Node fast=head;

        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }

        return false;

    }


    void main(){

            Node head1 = new Node(1);
            head1.next = new Node(2);
            head1.next.next = new Node(3);
            head1.next.next.next = new Node(4);

            System.out.println(hasCycle(head1));  // false


        Node head2 = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head2.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle (4 → 2)
        fourth.next = second;

        System.out.println(hasCycle(head2));


    }




}
