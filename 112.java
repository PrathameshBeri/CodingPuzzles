//112
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
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, sum, 0);
    }

    public static boolean helper(TreeNode n, int tar, int curr){

        if(n == null){
            return false;
        }
        if(n.left == null & n.right == null){
            curr += n.val;
            if(curr == tar) return true;
            else return false;
        }

        curr += n.val;
        return(helper(n.left,tar,curr) || helper(n.right, tar, curr));

    }
}
