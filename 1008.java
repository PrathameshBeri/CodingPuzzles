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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode n = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            placeNode(n, preorder[i]);
        }
        
        return n;
    }
    
    
    void placeNode(TreeNode n, int value){
        
        if(n == null) return;
        
        if(n.val > value){
            if(n.left == null){
                n.left = new TreeNode(value);
            }else{
                placeNode(n.left, value);
            }
            
        }
        if(n.val < value){
            if(n.right == null){
                n.right = new TreeNode(value);
            }else{
                placeNode(n.right, value);
            }
        }
    }
}