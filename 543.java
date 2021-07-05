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
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        return maxDepth(root);
    }
    
    
    int maxDepth(TreeNode n){
        if(n == null){
            return 0;
        }else if(n.left == null && n.right == null){
            return 0;
        }
        else{
            int m  =  depthL(n.left) + depthL(n.right);
            int l = maxDepth(n.left);
            int r = maxDepth(n.right);
            return Math.max(m, Math.max(l,r));
        }
    }
    
    int depthL(TreeNode n){
        if(n == null){
            return 0;
            
        }else if(n.left == null && n.right == null){
            return 1;
        }        
        else if(n.left != null && n.right == null){
            
           return 1 + depthL(n.left);
        }else if(n.right != null && n.left == null){
            return 1 + depthL(n.right);
        }else{
            
            return 1+ Math.max(depthL(n.left), depthL(n.right));
        }
        
    }
    
  
}