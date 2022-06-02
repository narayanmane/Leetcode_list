/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        if(root==NULL)
            return NULL;
        if(root==p || root==q)
            return root;
        TreeNode* lc1=lowestCommonAncestor(root->left,p,q);
        TreeNode* lc2=lowestCommonAncestor(root->right,p,q);
        if(lc1!=NULL && lc2!=NULL)
            return root;
        if(lc1!=NULL)
            return lc1;
        else
            return lc2;
        
        
    }
};
