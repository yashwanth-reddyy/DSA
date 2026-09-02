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
    ArrayList<Integer> t = new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        helper(root);
        return root;
    }
    public void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        t.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        int r=root.val;
        int ans=0;
        for(int i =0;i<t.size();i++){
            if(t.get(i)>r){
                ans+=t.get(i);
            }
        }
        root.val+=ans;
        helper(root.left);
        helper(root.right);

    }
}