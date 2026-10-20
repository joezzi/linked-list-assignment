/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to handle edge cases easily (like deleting the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize current pointer at the dummy node
        ListNode curr = dummy;
        
        // Traverse the list looking ahead at curr.next
        while (curr.next != null) {
            if (curr.next.val == val) {
                // Bypass/remove the target node
                curr.next = curr.next.next;
            } else {
                // Advance forward if there is no match
                curr = curr.next;
            }
        }
        
        // Return the updated list starting after the dummy node
        return dummy.next;
    }
}
