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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ArrayList<ListNode> y = new ArrayList<>();
        ListNode t=head;
        while(t!=null){
            y.add(t);
            t=t.next;
        }
        if(y.size()<=2){
            return head;
        }
        int count=1;
       int i =1;
       while(count-i<y.size()){
        if(i>y.size()-(count-i)){
            if((y.size()-(count-i))%2==0){
            int k =y.size()-1;
            int u=count-i;
             while(k>u){
                ListNode temp=y.get(k);
                y.set(k,y.get(u));
                y.set(u,temp);
                k--;
                u++;
            }
        }
            break;
        }
        else if(i%2==0){
            int k =count-1;
            int u =count-i;
            while(k>u){
                ListNode temp=y.get(k);
                y.set(k,y.get(u));
                y.set(u,temp);
                k--;
                u++;
            }
        }
        i++;
        count+=i;
       }
       ListNode dummy =new ListNode(-1);
       ListNode u=dummy;
       for(int s =0;s<y.size();s++){
        ListNode h =new ListNode(y.get(s).val);
        dummy.next=h;
        dummy=dummy.next;
       }return u.next;
    }
}