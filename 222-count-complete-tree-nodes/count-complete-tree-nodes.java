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
class Solution {
    int count1=0;
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root!=null&&root.left==null&&root.right==null){
        return 1;
         }
        helper(root);
        return count1;
        
    }
    public void helper(TreeNode root){
    if(root==null){
        return ;
    }
    if(root.left==null&&root.right==null){
        count1++;
        return;
    }
    helper(root.left);
    count1++;
    helper(root.right);
    return ;

}
}