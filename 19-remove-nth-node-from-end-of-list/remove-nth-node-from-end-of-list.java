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
        ListNode r=head;
        int e=0;
        while(r!=null){
            r=r.next;
            e++;
        }
        if(e==n){
            return head.next;
        }
        ListNode t =head;
        for(int i =0;i<e-n-1;i++){
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}