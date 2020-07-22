package problems.addtwonumbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(listNodeToInt(l1));
        System.out.println(listNodeToInt(l2));
        return intTolistNode(listNodeToInt(l1) + listNodeToInt(l2));
    }

    public int listNodeToInt(ListNode l) {
        ListNode index = l;
        int i = 0;
        int num = 0;
        do {
            num = num + index.val * (int) Math.pow(10, i);
            i++;
            index = index.next;
        }
        while (index != null);
        return num;
    }

    public ListNode intTolistNode(int num) {
        ListNode result = new ListNode();
        ListNode prev = new ListNode();
        ListNode cur = new ListNode();
        int val = num % 10;
        result = new ListNode(val);
        prev = result;
        num = num/10;
        while (num != 0) {
            val = num % 10;
            num = num / 10;
            cur = new ListNode(val);
            prev.next = cur;
            prev = cur;
        }
        return result;
    }
}
