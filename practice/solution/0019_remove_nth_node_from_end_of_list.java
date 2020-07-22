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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode left = dummyHead;
        ListNode right = dummyHead;
        
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        
        left.next = left.next.next;
        
        return dummyHead.next;
    }
}