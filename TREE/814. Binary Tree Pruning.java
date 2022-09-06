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
// remove the subtree node value contains zero
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) return null;
        return root;
        /*if(root==null)return null;
        contains(root);
        return root;*/
        
    }
  /*  public boolean contains(TreeNode node)
    {
        if(node==null)return false;
        boolean contains_left=contains(node.left);
        boolean contains_right=contains(node.right);
        if(!contains_left)node.left=null;
        if(!contains_right)node.right=null;
        return node.val==1 || contains_left || contains_right;
    }*/
}
