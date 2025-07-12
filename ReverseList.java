class ListNode {
    int val;
    ListNode next;

    // Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseList {

    // Method to reverse the linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; // store next node
            curr.next = prev;              // reverse pointer
            prev = curr;                   // move prev forward
            curr = nextTemp;               // move curr forward
        }

        return prev; // new head of reversed list
    }

    // Helper method to print a linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test it
    public static void main(String[] args) {
        // Create example list: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ReverseList rl = new ReverseList();

        System.out.println("Original list:");
        rl.printList(head);

        ListNode reversedHead = rl.reverseList(head);

        System.out.println("Reversed list:");
        rl.printList(reversedHead);
    }
}
