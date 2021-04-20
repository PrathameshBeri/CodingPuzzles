//113

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(root, sum, 0, path, paths);
        return paths;
    }

    public static void helper(TreeNode n, int tar, int curr, List<Integer> path, List<List<Integer>> paths){

        if(n == null) return;
        if(n.left == null && n. right == null){
            if((n.val + curr) == tar){
                path.add(n.val);
                paths.add(path);
                return;
            }
            else return;
        }

        curr += n.val;
        path.add(n.val);
        List<Integer> lTree = new ArrayList<>();
        List<Integer> rTree = new ArrayList<>();
        lTree.addAll(path);
        Collections.copy(lTree, path);
        rTree.addAll(path);

        helper(n.left, tar, curr, lTree, paths);
        helper(n.right, tar,curr, rTree, paths);

    }
}
