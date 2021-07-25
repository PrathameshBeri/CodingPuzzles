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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        Set<List<Integer>> set = new HashSet<>();
        Map<List<Integer>,TreeNode> dups = new HashMap<>();
        formSubTrees(root, set, dups);
        
        return dups.values().stream().filter(x -> x != null).collect(Collectors.toList());
    }
    
    public void formSubTrees(TreeNode node, Set<List<Integer>> uniques, Map<List<Integer>,TreeNode> dups){
 
        if(node == null){
            return;
        }
        List<Integer> left = formTree(node.left);
        
        List<Integer> right = formTree(node.right);
        
        
        
        if(left != null && left.size() > 0 && uniques.contains(left)){
           // System.out.println("ssdf" + left + node.left);
           // System.out.println(node.left);
            dups.put(left,node.left);
        }else if(left != null && left.size() > 0){
          //  System.out.println("breka");
          //  System.out.println(left);
            uniques.add(left);
        }
        
        if(right != null && right.size() > 0 && uniques.contains(right) ){
           // System.out.println("kkok" + right + node.right);
          //  System.out.println(node.right);
            dups.put(right,node.right);
        }else if(right != null && right.size() > 0){
           // System.out.println("breka");
           // System.out.println(right);
            uniques.add(right);
        }
        
        formSubTrees(node.left, uniques,dups);
        formSubTrees(node.right, uniques,dups);
        
        
        }
        
    
    List<Integer> formTree(TreeNode n){
        if(n == null){
            return null;
        }
        List<TreeNode> list = new LinkedList<>();
        List<Integer> listOfInts = new LinkedList<>();
        list.add(n);
        listOfInts.add(n.val);
        int j = 0;
        while(true){
            int size = list.size();
            if(j == size){
                break;
            }
            for(;j < size; j++){
                TreeNode u = list.get(j);
                if(list.get(j) != null){
                    list.add(u.left);
                    if(u.left != null){
                        listOfInts.add(u.left.val);
                    }else{
                        listOfInts.add(null);
                    }
                    list.add(u.right);
                     if(u.right != null){
                        listOfInts.add(u.right.val);
                    }else{
                        listOfInts.add(null);
                    }
                }
                
            }
            
        }
    return listOfInts;
    }
    
    
    
}