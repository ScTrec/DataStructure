package LeetCode;

public class Solution4 {

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        ListNode node = new ListNode(arr);
        ListNode res = removeElements(node,1);
        System.out.println(res);
    }
}
