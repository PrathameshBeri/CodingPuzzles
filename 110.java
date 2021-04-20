//110

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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        Deque<TreeNode> main = new LinkedList<>();
        Deque<TreeNode> left = new LinkedList<>();
        Deque<TreeNode> right = new LinkedList<>();

        main.add(root);
        boolean state = true;
        while(main.size() > 0){

            int n = main.size();
            for(int i = 0; i < n; i++){
                TreeNode ni = main.poll();
                state = check(ni.left, ni.right);
                if(!state) return state;

                if(ni.left != null) main.add(ni.left);
                if(ni.right != null) main.add(ni.right);
            }
        }

        return state;
    }

    public static boolean check(TreeNode l, TreeNode r){
        Deque<TreeNode> left = new LinkedList<>();
        Deque<TreeNode> right = new LinkedList<>();

        int lcounter = 0;
        int rcounter = 0;
        if(l != null) left.add(l);
        if(r != null) right.add(r);

        while(true){
            int ls = left.size();
            if(ls > 0) lcounter++;
            int rs = right.size();
            if(rs > 0) rcounter++;

            if(Math.abs(lcounter - rcounter) > 1) return false;
            if(ls == 0 && rs == 0) return true;

            for(int i = 0; i < ls; i++){
                TreeNode lo = left.poll();
                if(lo.left != null) left.add(lo.left);
                if(lo.right != null) left.add(lo.right);
            }

             for(int i = 0; i < rs; i++){
                TreeNode lo = right.poll();
                if(lo.left != null) right.add(lo.left);
                if(lo.right != null) right.add(lo.right);
            }


        }

    }

}
