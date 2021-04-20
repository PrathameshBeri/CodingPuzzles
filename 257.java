//257
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
    static List<String> paths = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        paths.clear();
        helper(root, new StringBuilder(""));
        return paths;

    }

    static void helper(TreeNode n, StringBuilder s){
        if(n == null){
            return;
        }else if(n.left == null && n.right == null){
         if(s.length() > 0){
            s.append("->").append(n.val);
            }else{
                s.append(n.val);
            }
            paths.add(s.toString());
            return;
        }else{

            if(s.length() > 0){
            s.append("->").append(n.val);
            }else{
                s.append(n.val);
            }
            helper(n.left, new StringBuilder(s));
            helper(n.right, new StringBuilder(s));

        }

    }
}
