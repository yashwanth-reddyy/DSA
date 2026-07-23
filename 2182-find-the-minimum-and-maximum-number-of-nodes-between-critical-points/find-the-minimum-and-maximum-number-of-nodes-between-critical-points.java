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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[]={-1,-1};
        ListNode prev=head;
        ListNode curr=head.next;
        if(curr.next==null){
            return arr;
        }
        ArrayList<Integer> y =new ArrayList<>();
        int i=1;
        ListNode next1=curr.next;
        while(next1!=null){
             if(curr.val>prev.val&&curr.val>next1.val){
                  y.add(i);
             }
              if(curr.val<prev.val&&curr.val<next1.val){
                y.add(i);
             }
             prev=curr;
             curr=next1;
             next1=next1.next;
             i++;
            
        }
        if(y.size()<=1){
            return arr;
        }
        arr[1]=y.get(y.size()-1)-y.get(0);
        int min=Integer.MAX_VALUE;
        for(int w =0;w<y.size()-1;w++){
            min=Math.min(min,y.get(w+1)-y.get(w));
        }
        arr[0]=min;
        return arr;
        
    }
}