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
    public List<List<String>> printTree(TreeNode root) {
        
        int height = heightOfTree(root,0);
        
        
        int cols = 1 << (height + 1);
        
        System.out.println(" col " + (cols -1) + " height " + (height + 1));
        String[][] matrix = new String[height+1][cols - 1];
        
        int c = (cols - 1)/2;
        int r = 0;
            
        createLeftPlaces(root, 0, height,matrix, r, c);
        
        List<List<String>> result = new ArrayList<>();
        
        for(int i = 0; i < matrix.length; i++){
            List<String> subList = new ArrayList<>();
            for(int j = 0; j < matrix[0].length; j++){
                
                if(matrix[i][j] != null){
                    subList.add(matrix[i][j]);
                }else{
                    subList.add("");
                }
                
            }
            result.add(subList);
        }
        
        return result;
    }
    
    
    void createLeftPlaces(TreeNode n, int currentLevel, int height, String[][] matrix, int r, int c){
        
        if(n == null){
            return;
        }
        
    
            
         matrix[r][c] = String.valueOf(n.val);
        
        
        int leftCol = getLeftChild(c,height,r);
       // System.out.println("lcol " + leftCol + " c " + c + " h " + height + " r" + r);
        int rightCol = getRightChild(c,height,r);
            
        createLeftPlaces(n.left, currentLevel + 1, height, matrix, r + 1,leftCol );
            
        createLeftPlaces(n.right, currentLevel + 1, height, matrix, r + 1, rightCol);
            
    }
    
    
    int getLeftChild(int c, int height, int r){
        int vv = height - r -1 ;
        int neg = 1 << vv;
        
        return c - neg;
        
    }
    
    int getRightChild(int c, int height, int r){
        int vv = height - r -1 ;
        int neg = 1 << vv;
        
        return c + neg;
        
    }
    
    
    int heightOfTree(TreeNode n, int h){
        if(n == null){
            return h;
        }else{
            int heightl = h;
            int heightr = h;
            if(n.left != null ){
                heightl = heightOfTree(n.left,h+1);
            }
            if(n.right != null){
                heightr = heightOfTree(n.right,h+1);
            }
            
            return Math.max(heightl, heightr);
        }
    }
}