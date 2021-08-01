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
    public void flatten(TreeNode root) {
        
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        List<TreeNode> nodeL = new ArrayList<>();
        flattenHelper(root,nodeL);
        TreeNode groot = nodeL.get(0);
        groot.left = null;
        groot.right = null;
        root = groot;
        for(int i = 1; i < nodeL.size(); i++){
            TreeNode cu = nodeL.get(i);
            cu.left = null;
            cu.right = null;
            groot.right = cu;
            groot = groot.right;
        }
        
    }
    
    void flattenHelper(TreeNode curr, List<TreeNode> nodes){
        if(curr == null){
            return;
        }
       
        nodes.add(curr);
        flattenHelper(curr.left,nodes);
        flattenHelper(curr.right, nodes);
    }
}