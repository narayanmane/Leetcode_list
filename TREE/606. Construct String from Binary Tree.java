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
import java.util.*;
class Solution {
    StringBuilder sb;
    private void sovle(TreeNode root)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)
        {
            sb.append(root.val);
            return ;
        }
    
    sb.append(root.val);
    sb.append('(');
    sovle(root.left);
    sb.append(')');
    if(root.right!=null)
    {
        sb.append('(');
        sovle(root.right);
        sb.append(')');
        
    }
    return;
}
    public String tree2str(TreeNode root) {
        sb=new StringBuilder();
        sovle(root);
        return sb.toString();
        
        // string="";
        // tree2str(root.val);
        // tree2str(root.left);
        // tree2str(root.right);          

        
    }
}
