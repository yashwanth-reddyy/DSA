/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
   TreeNode t;
   HashSet<Integer> r= new HashSet<>();
    public FindElements(TreeNode root) {
        helper(root,0);
    }
    public boolean find(int target) {
        return r.contains(target);
    }
    public void helper(TreeNode root,int count){
    if(root==null){
        return;
    }
    root.val=count;
    r.add(count);
    helper(root.left,(2*count)+1);
    helper(root.right,(2*count)+2);
    
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */