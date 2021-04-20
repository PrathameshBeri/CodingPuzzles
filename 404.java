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
    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> ints = new ArrayList<>();
        sumLeftLeaveHelper(root, ints);
        int n = ints.stream().reduce(0, Integer::sum);
        return n;
    }


    public void sumLeftLeaveHelper(TreeNode n, List<Integer> count){


        if(n == null) return;

        if(n.left != null && n.left.left == null && n.left.right == null)
        {count.add(n.left.val);
        System.out.println(n.left.val);
        }
        sumLeftLeaveHelper(n.left, count);
        sumLeftLeaveHelper(n.right, count);


    }
}
