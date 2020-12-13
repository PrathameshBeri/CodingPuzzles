//111

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
    public int minDepth(TreeNode root) {

        if(root == null) return 0;
        Deque<TreeNode> dec = new LinkedList<>();

        dec.add(root);
        int counter = 0;
        while(dec.size() > 0){

             int s = dec.size();
            for(int i = 0; i < s; i++){
              TreeNode head = dec.poll();
            if(head != null){
              if(head.left != null){
                  dec.add(head.left);
              }
                if(head.right != null){
                    dec.add(head.right);
                }

            }
                if((head.left == null) && (head.right == null)) return counter+1;
            }

            counter++;

        }
        return counter;
    }
}
