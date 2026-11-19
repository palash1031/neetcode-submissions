class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr.next != null) {
            int g = gcd(curr.val, curr.next.val);
            ListNode insert = new ListNode(g);
            insert.next = curr.next;
            curr.next = insert;
            curr = insert.next;
        }

        return head;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}