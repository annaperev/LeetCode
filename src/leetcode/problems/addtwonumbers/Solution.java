package leetcode.problems.addtwonumbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode head = new ListNode();
        ListNode a = l1, b = l2;
        ListNode current = head;

        while (a != null || b != null) {
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            sum = x + y + carry;

            carry = sum / 10;

            current.next = new ListNode((sum) % 10);
            current = current.next;

            a = (a != null) ? a.next : null;
            b = (b != null) ? b.next : null;
        }
        current.next = (carry != 0)?new ListNode(carry):null;
        return head.next;
    }
}
