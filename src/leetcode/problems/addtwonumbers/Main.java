package leetcode.problems.addtwonumbers;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);

        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(9, l21);
        ListNode l2 = new ListNode(1,l22);

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(l1,l2);
        System.out.println(result.next.next.val + " " + result.next.val + " " + result.val);
    }
}
