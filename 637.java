//637
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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> averages = new ArrayList<>();

        if(root == null ) return averages;

        Deque<TreeNode> deck = new ArrayDeque<>();
        deck.add(root);

        while(deck.size() > 0 ){
            int i = deck.size();
            long count = 0;
            for(int j = 0; j < i; j++){
                TreeNode o = deck.getFirst();
                count += o.val;
                if(o.left != null) deck.add(o.left);
                if(o.right != null ) deck.add(o.right);
                deck.remove();
            }

            averages.add((double)count/i);

        }

        return averages;

    }
}
