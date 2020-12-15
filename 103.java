//103

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> soln = new ArrayList<>();
        if(root == null) return soln;
        Deque<TreeNode> deck = new ArrayDeque<>();
        deck.add(root);
        boolean zigzag = false;
        while(deck.size() > 0){
            int n = deck.size();
            List<Integer> lis = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode head;
                 head = deck.poll();
                lis.add(head.val);
                if(head.left != null ) deck.add(head.left);
                if(head.right != null) deck.add(head.right);
            }
            if(zigzag){
                Collections.reverse(lis);
            }
            soln.add(lis);
            zigzag = !zigzag;
        }
        return soln;

    }
}
