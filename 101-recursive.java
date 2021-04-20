//101- recursive


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
    public boolean isSymmetric(TreeNode root) {
        if(root == null ) return true;
        return treeHelper(root.left, root.right);


    }


    public static boolean treeHelper(TreeNode l, TreeNode r){
      if(l == null && r == null){
          return true;
      }  else if(l == null || r == null){
          return false;
      }
        else{
            return((l.val == r.val) && treeHelper(l.left, r.right) && treeHelper(l.right, r.left));
        }
    }
}
