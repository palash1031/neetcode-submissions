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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode curr = slow.next;
        slow.next = null;
        
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;

        int counter = 0;

        while (head != null && prev != null) {
            if (counter % 2 == 0) {
                dummy.next = head;
                head = head.next;
            } else {
                dummy.next = prev;
                prev = prev.next;
            }
            dummy = dummy.next;
            counter++;
        }

        dummy.next = (head != null) ? head : prev;
        dummy = dummy.next;
        return;
    }
}
