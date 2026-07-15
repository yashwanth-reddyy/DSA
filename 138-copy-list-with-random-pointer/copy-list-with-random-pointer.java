/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Integer> y= new HashMap<>();
        int i =0;
        Node t=head;
        while(t!=null){
            y.put(t,i);
            i++;
            t=t.next;
        }
        Node q =head;
        HashMap<Integer,Integer> w=new HashMap<>();
        int u =0;
        while(q!=null){
            if(q.random==null){
                w.put(u,-1);
            }
            else{
                w.put(u,y.get(q.random));
            }
            u++;
            q=q.next;
        }
        Node f= head;
        Node dummy = new Node(-1);
        Node r=dummy;
        Node n=dummy;
        ArrayList<Node> s = new ArrayList<>();
        while(f!=null){
            Node z=new Node(f.val);
            s.add(z);
            dummy.next=z;
            dummy=dummy.next;
            f=f.next;
        }
        n=n.next;
        for(int l:w.keySet()){
            if(w.get(l)==-1){
                n.random=null;
            }
            else{
                n.random=s.get(w.get(l));
            }
            n=n.next;
        }
        return r.next;
        
        


       
         
    
        
    }
}