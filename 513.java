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
    public int findBottomLeftValue(TreeNode root) {
        
        return returnHelper(root);
    }
    
    
    int returnHelper(TreeNode root){
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int val = 0;
        int size = queue.size();
        while(size > 0){
             size = queue.size();
            for(int i = 0; i < size; i++){
                
                TreeNode n = queue.poll();
                if(n != null && i == 0){
                    val = n.val;
                }
                if(n.left != null){
                    queue.add(n.left);
                }
                if(n.right != null){
                    queue.add(n.right);
                }
                
            }
            
        }
        return val;
    }
    
    
}