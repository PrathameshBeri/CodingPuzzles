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
    public List<TreeNode> allPossibleFBT(int n) {
        
        HashMap<Integer, List<TreeNode>> map = new HashMap<>();
          
        return formNode(n, map);
    }
		
		//We are going to have a valid solution only for odd numbers
        //if n = 0 return null;
        //if n = 1; return the single node;
        //if n = 3; return one single possiblity
        //if n = 5; return treenodes which have left subtree as possible trees of 3, right with 1. Then with 
		//left as 1 and right as 3.
        //if n = 7 return treenode with left subtree as possbile trees of 5 and other with 1 and vice //versa.
        //maintain hashMap for each odd number. if not present, memoize it
        //for each iteration in the hashMap create new List<TreeNode>
        
    
   List<TreeNode> formNode(int nodes, HashMap<Integer, List<TreeNode>> existingTrees){
        
        if(existingTrees.containsKey(nodes)){
            return existingTrees.get(nodes);
        }else{
            if(nodes == 0){
                
                existingTrees.put(nodes, null);
                return existingTrees.get(nodes);
                
            }
            
            if(nodes == 1){
                
                TreeNode n = new TreeNode(0);
                List<TreeNode> l = new ArrayList();
                l.add(n);
                existingTrees.put(nodes,l);
                return existingTrees.get(nodes);
                
            }
            
            List<TreeNode> finalList = new ArrayList<>();
            for(int i = 1; i < nodes - 1; i += 2){
                
                List<TreeNode> left = formNode(i, existingTrees);
                List<TreeNode> right = formNode((nodes - 1) - i, existingTrees);
                
                for(TreeNode ln : left){
                  
                    for(TreeNode rn : right){
                    TreeNode inst = new TreeNode(0);
                    inst.left = ln;
                    inst.right = rn;
                    finalList.add(inst);
                        
                    }
                    
                    
                }
                
             
                
                
            }
            
            existingTrees.put(nodes, finalList);  
            
            return existingTrees.get(nodes);
        }
        
        
    }
    
    
    
    
}
