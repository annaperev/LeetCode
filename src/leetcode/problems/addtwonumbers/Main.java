package leetcode.problems.addtwonumbers;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(
                9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))))))));

        l1.sout();
        l2.sout();

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(l1, l2);
        result.sout();
    }
}
