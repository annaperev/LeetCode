package leetcode.problems.addtwonumbers;


public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void sout (){
        ListNode list = this;
        do{
            System.out.print(list.val + " ");
            list = list.next;
        }
        while (list !=  null);
        System.out.println();
    }
}
