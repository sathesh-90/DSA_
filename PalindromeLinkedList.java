import java.util.Stack;

public class PalindromeLinkedList {

    // Definition for singly-linked list
    public static class ListNode {
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
    static class Solution {
        public boolean isPalindrome(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            ListNode current = head;

            while (current != null) {
                stack.push(current.val);
                current = current.next;
            }

            current = head;
            while (current != null) {
                if (stack.pop() != current.val) {
                    return false;
                }
                current = current.next;
            }

            return true;
        }
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] values = {1, 2, 2, 1};
        ListNode head = createList(values);

        Solution solution = new Solution();
        boolean result = solution.isPalindrome(head);

        System.out.println("Is palindrome? " + result);
    }
}
