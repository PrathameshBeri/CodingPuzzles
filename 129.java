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
    public int sumNumbers(TreeNode root) {
        
        List<StringBuffer> paths = new LinkedList<>();
        treePaths(root, new StringBuffer(),paths);
        
      //  paths.forEach(System.out::println);
        
        return paths.stream().map(x -> x.toString()).map(Integer::parseInt).
            reduce((x,y) -> x+y).get();
        
    }
    
    void treePaths(TreeNode node, StringBuffer s, List<StringBuffer> list){
        if(node == null){
          return;
        }else if( node.left == null && node.right == null){
            s.append(node.val);
            list.add(s);
        }
        else{
            s.append(node.val);
            StringBuffer left = new StringBuffer(s);
            StringBuffer right = new StringBuffer(s);
            treePaths(node.left, left, list);
            treePaths(node.right, right,list);
            
        }
        
        
    }
}