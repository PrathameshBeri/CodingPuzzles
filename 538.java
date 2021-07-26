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
    public TreeNode convertBST(TreeNode root) {
        
       // int sum = sumOfTree(root.left.right,0);
       // System.out.println(sum);
        replaceSums(root,0);
        return root;
    }
    
    void replaceSums(TreeNode n, int sum){
    
        if( n == null){
            return;
        }else{
            
            
            int rightSum = 0;
           if(n.right != null){
             rightSum = sumOfTree(n.right,0);
            
           }
            replaceSums(n.right,sum);
            n.val = rightSum + n.val + sum;
          
            replaceSums(n.left,n.val);
            
            
        }
        
        
    }
       
    int sumOfTree(TreeNode n, int sum){
        if(n == null){
            return sum;
        }else if(n.left == null && n.right == null){
            return sum + n.val;
        }
        else{
            
            int y = sumOfTree(n.right, sum);
            int z = sumOfTree(n.left, sum);
            return n.val + y + z;
        }
        
    }
}