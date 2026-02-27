package data.List;

public class PalindromeList {

    void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new  Node(1);

        System.out.println(isPalindrome(head));  // true
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;
        // Step 1: Find middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step 2: Reverse second half
        Node secHalf = reverse(slow);
        Node firHalf = head;
        // Step 3: Compare halves
        while (secHalf != null) {
            if (firHalf.val != secHalf.val)
                return false;
            firHalf = firHalf.next;
            secHalf = secHalf.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


}
