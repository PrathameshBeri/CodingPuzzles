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
    public int goodNodes(TreeNode root) {
        
       // List<TreeNode> nodes = new ArrayList<>();
        Integer nodes = 0;
        countNodes(root,root.val,nodes);
        return nodes;
//return nodes.size();
        
    }
    
   public void countNodes(TreeNode node, int val, Integer goodNodes ){
       if(node.val >= val){
            //goodNodes.add(node);
            goodNodes += 1;
           System.out.println(goodNodes);
            val = node.val;
        }
       
       if(node.left != null) countNodes(node.left, val, goodNodes);
       if(node.right != null) countNodes(node.right, val, goodNodes);
    }
}