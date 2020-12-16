//226
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
    public TreeNode invertTree(TreeNode n) {

       helper(n);
        return n;
    }

    public static void helper(TreeNode root){
        if(root == null) return ;
        else{

            TreeNode temp = new TreeNode();
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            helper(root.left);
            helper(root.right);
        }

    }
}
