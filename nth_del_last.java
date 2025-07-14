// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Solution class
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases (like deleting head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both fast and slow until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
}

// Main class to test the solution
public class nth_del_last {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Remove 2nd node from end

        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, n);

        // Print the resulting list
        printList(result);
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
