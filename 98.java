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
    public boolean isValidBST(TreeNode root) {
        return checkNode(root);
        //node should be greater than left, and less than right
    }
    
    boolean checkNode(TreeNode r){
        
        if(r.left == null && r.right == null)
            return true;
        else if( r.left != null && r.right == null){
            
            return (r.val > maxVal(r.left) && checkNode(r.left));
            
        }else if(r.left == null && r.right != null){
            return (r.val < minVal(r.right) && checkNode(r.right));
        }else{
            
            return ((r.val > maxVal(r.left) && checkNode(r.left)) && (r.val < minVal(r.right) && checkNode(r.right)));
        }
        
    }
    
    int maxVal(TreeNode r){
        if(r.right == null){
            return r.val;
        }else{
            return maxVal(r.right);
        }
    }
    
    int minVal(TreeNode r){
        if(r.left == null){
            return r.val;
        }else{
            return minVal(r.left);
        }
    }
}