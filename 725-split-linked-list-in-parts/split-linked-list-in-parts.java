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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[] = new ListNode[k];
        ListNode h= head;
        int size=0;
        while(h!=null){
           h=h.next;
           size++;
        }
       int pairs=size/k;
       int rem=size%k;
       if(pairs==0){
        ListNode e= head;
        int j =0;
        while(e!=null){
            ListNode temp =e.next;
            e.next=null;
            ans[j]=e;
            e=temp;
            j++;
        }
       }
        else{
            ListNode y= head;
            int w =0;
            while(y!=null){
               if(rem>0){
                ans[w]=y;
                int s=pairs+1;
                for(int i=0;i<s;i++){
                    if(i==s-1){
                        ListNode v=y;
                        y=y.next;
                        v.next=null;
                    }
                    else{
                        y=y.next;
                    }
                }
                w++;
                rem--;
               }
               else{
                ans[w]=y;
                int a=0;
                while(a<pairs){
                   if(a==pairs-1){
                       ListNode v=y;
                        y=y.next;
                        v.next=null;
                        break;
                   }
                   else{
                    y=y.next;
                    a++;
                   }
                }
                 w++;
               }
            }
        }
        return ans;
       
    }
}