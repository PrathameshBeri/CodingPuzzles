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
        
        
       recoverTreeHelper(root);
        
    }
    
    public void recoverTreeHelper(TreeNode node){
  
        if(node == null) return;
        
    TreeNode lmax = searchLeftTree(node.left);
    TreeNode rmax = searchRightTree(node.right);
        
    if(lmax != null && rmax != null && lmax.val > node.val && rmax.val < node.val){
        swap(lmax, rmax);
        return;
    }else if(lmax!= null && lmax.val > node.val){
        swap(lmax, node);
        return;
    }else if(rmax != null && rmax.val < node.val){
        swap(rmax, node);
        return;
    }else{
        recoverTree(node.left);
        recoverTree(node.right);
    }
        
        
    }
    
    TreeNode searchLeftTree(TreeNode lef){
        if(lef == null ){
            return null;
        }
        if(lef.left == null && lef.right == null){
            return lef;
        }
        TreeNode toReturn = lef;
        TreeNode lefty = searchLeftTree(lef.left);
        TreeNode righty = searchLeftTree(lef.right);
        if(lefty != null && lefty.val > lef.val){
             toReturn = lefty;
        }
        
        if(righty != null && righty.val > toReturn.val){
            toReturn = righty;
        }
        
        return toReturn;
        
    }
    
    TreeNode searchRightTree(TreeNode righ){
        if(righ == null){
            return null;
        }
        if(righ.right ==null && righ.left == null){
            return righ;
        }
        
        TreeNode toReturn = righ;
        TreeNode lefty = searchRightTree(righ.left);
        TreeNode righty = searchRightTree(righ.right);
        if(lefty != null && lefty.val < righ.val){
             toReturn = lefty;
        }
        
        if(righty != null && righty.val < toReturn.val){
            toReturn = righty;
        }
        
        return toReturn;
        
    }
    public void swap(TreeNode orig, TreeNode exchange){
        int vall = orig.val;
        orig.val = exchange.val;
        exchange.val = vall;
        
    }
}