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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      
        if(postorder.length < 1) return null;
        if(postorder.length < 2) return new TreeNode(postorder[0]);
        
        TreeNode root = new TreeNode(postorder[postorder.length -1]);
        
        HashMap<Integer, Integer> posMap = new HashMap<>();
        int y = 0;
        for(int i : inorder){
            posMap.put(i, y++);
        }
        
        for(int in = postorder.length - 2; in >= 0 ; in--){
            addNode(root, postorder[in], posMap);
        }
        
        return root;
        
    }
    
 void addNode(TreeNode n, int num, Map<Integer, Integer> posMap){
        
        int posn = posMap.get(num);
        int posr = posMap.get(n.val);
        if(posn < posr){
            
            if(n.left == null){
                n.left = new TreeNode(num);
                return;
            }else{
                addNode(n.left, num, posMap);
            }
            
        }else{
            if(n.right == null){
                n.right = new TreeNode(num);
                return;
            }else{
                addNode(n.right, num, posMap);
            }
        }
    }
}