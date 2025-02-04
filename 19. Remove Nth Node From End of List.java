class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        
        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
        
        for(int i = 1; i <= n+1; i++ ){
            fast = fast.next;
        }
        
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummy_head.next;
    }
}