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
     List<List<Integer>> t = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> t1 = new ArrayList<>();
        int sum =0;
        helper(root,t1,sum,targetSum);
        return t;
    }
    public void helper(TreeNode root,List<Integer>t1,int sum,int targetSum){
        if(root!=null&&(root.right==null&&root.left==null)){
            if((sum+root.val)==targetSum){
                t1.add(root.val);
                t.add(new ArrayList<>(t1));
                t1.remove(t1.size()-1);
            }
            return;
        }
        if(root==null){
            return;
        }
        t1.add(root.val);
        helper(root.left,t1,sum+root.val,targetSum);
        helper(root.right,t1,sum+root.val,targetSum);
        t1.remove(t1.size()-1);
    }
}