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
    public boolean isEvenOddTree(TreeNode root) {
        return helper(root);
    }
    
    boolean helper(TreeNode root){
        
        List<TreeNode> list = new ArrayList<>();
        boolean corr = true;
        int currentLevel = 0;
        int prev = 0;
        int j = 0;
        list.add(root);
        
        while(true){
            
          int size = list.size();
          if(size == j){
              break;
          }
            
           prev = currentLevel % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
          for(; j < size; j++){
              
              TreeNode n = list.get(j);
              
              if(currentLevel % 2 == 0){
                  
                  if(n.val % 2 == 0){
                      return false;
                  }
                  
                  if(n.val <= prev){
                      return false;
                  }
                  
                  if(n.left != null){
                      list.add(n.left);
                  }          
                  if(n.right != null){
                      list.add(n.right);
                  }
                  
              }else{
                 if(n.val % 2 != 0){
                      return false;
                  }
                  
                  if(n.val >= prev){
                      return false;
                  }
                  
                  if(n.left != null){
                      list.add(n.left);
                  }          
                  if(n.right != null){
                      list.add(n.right);
                  }
                  
              }
              
              prev = n.val;
              
          }
            currentLevel++;
            
        }
        
        return true;
    }
}