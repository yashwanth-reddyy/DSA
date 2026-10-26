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
    public int pairSum(ListNode head) {
        ArrayList<Integer> x= new ArrayList<>();
        while(head!=null){
            x.add(head.val);
            head=head.next;
        }
        int i =0;
        int j =x.size()-1;
        int max=Integer.MIN_VALUE;
        while(j>=i){
            int sum =x.get(i)+x.get(j);
            if(sum>max){
                max=sum;
            }
            i++;
            j--;
        }
        return max;
    }
}