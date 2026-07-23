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
    ListNode n;
    ArrayList<ListNode> q=new ArrayList<>();
    Random rand = new Random();
    public Solution(ListNode head) {
        n=head;
        while(head!=null){
            q.add(head);
           head=head.next;
        }

    }
    
    public int getRandom() {
        int k=  rand.nextInt(q.size());
        int t= q.get(k).val;
        return t;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */