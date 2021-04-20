//653
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

    int count = 0;

    public boolean findTarget(TreeNode root, int k) {


        List<Integer> lis = new ArrayList<>();

        addNodes(root, lis);

        int count = 0;


        while(count < lis.size()){

            int ele = lis.get(count);

            int diff = k - ele;
            int y = lis.lastIndexOf(diff);
            if( y != -1 && y != count){
                return true;
            }
            count++;
        }

        return false;

    }

    void addNodes(TreeNode r, List l){

        if( r == null) return;

        l.add(r.val);
        addNodes(r.left, l);
        addNodes(r.right, l);

    }

}
