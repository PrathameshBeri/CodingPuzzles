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
    public List<Integer> largestValues(TreeNode root) {
        
        return largestValueshelper(root);
    }
    
    
    List<Integer> largestValueshelper(TreeNode root){
        if(root == null) return new ArrayList();
        List<TreeNode> queue = new LinkedList<>();
        int i =0;
        int max = Integer.MIN_VALUE;
        queue.add(root);
        List<Integer> maxValues = new ArrayList<>();
        
        while(true){
            int size = queue.size();
            if(size == i){
                break;
            }
             max = Integer.MIN_VALUE;   
            for(;i < size; i++){
                TreeNode n = queue.get(i);
                if(n != null && n.val > max){
                    max = n.val;
                }
                if(n.left != null){
                    queue.add(n.left);
                }
                if(n.right != null){
                    queue.add(n.right);
                }
            }    
            
            maxValues.add(max);
        }
        
        return maxValues;
        
    }
}