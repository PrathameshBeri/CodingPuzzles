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
    public void recoverTree(TreeNode root) {
        
        recoverTree(root, null);
        
    }
    
    public void recoverTree(TreeNode node, TreeNode parent){
        
        if(node == null){
            return;
        }else{
            
            if(node.left != null){
                 if(parent != null && node.left.val > parent.val){
                    swap(node.left,parent);
                    return;
                }else  if(node.left.val > node.val){
                    swap(node.left, node);
                    return;
                }
                
                else{
                    recoverTree(node.left, node);
                }
                
            }
            
           if(node.right != null){
               
               
               if(parent != null && node.right.val > parent.val){
                   swap(node.right, parent);
                   return;
               }else if(node.right.val > node.val){
                   swap(node.right, node);
                   return;
               }
                   else{
                   recoverTree(node.right, node);
               }
               
               
           } 
        }
        
    }
    
    public void swap(TreeNode orig, TreeNode exchange){
        int vall = orig.val;
        orig.val = exchange.val;
        exchange.val = vall;
        
    }
}