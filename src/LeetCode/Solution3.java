package LeetCode;

public class Solution3 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next=head;

        ListNode prev = dummyHead;
        while(prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        ListNode node = new ListNode(arr);
        System.out.println(node);
        ListNode node1 = removeElements(node,2);
        System.out.println(node1);
    }
}
