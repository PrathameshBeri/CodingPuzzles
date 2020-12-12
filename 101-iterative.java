//101- iterative
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
        if(root == null) return true;

        Deque<TreeNode> deck = new LinkedList<>();
        deck.add(root);
        deck.add(root);
        while(deck.size() > 0){



                TreeNode l  = deck.poll();
                TreeNode r = deck.poll();
                if(l == null && r == null){
                    continue;
                }else if( l == null || r == null){
                    return false;
                }else if(l.val != r.val){
                    return false;
                }

                deck.add(l.left);
                deck.add(r.right);
                deck.add(l.right);
                deck.add(r.left);

                }


        return true;
    }
}
