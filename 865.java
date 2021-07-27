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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        
      List<List<TreeNode>> list = new ArrayList<>();
        List<TreeNode> curr = new LinkedList<>();
        deepest(list,curr,root);
        
        Collections.sort(list, (x,y) -> y.size() - x.size());
        int size = list.get(0).size();
        
        
        List<List<TreeNode>> maxList = list.stream().filter(x -> x.size() == size).collect(Collectors.toList());
        
        // for(List<TreeNode> l : maxList){
        //         for(TreeNode n : l){
        //             System.out.print(" " + n.val);
        //         }
        //     System.out.println();
        //     }
        
        int x = 0;
        int finali = 0;
        for(int i = 0; i < size; i++){
            TreeNode n = maxList.get(0).get(i);
            x = 0;
            for(List<TreeNode> l : maxList){
                if(l.get(i) == n ){
                    x++;
                    
                }
            }
            if(x == maxList.size()){
                finali = i;
                
            }
            
        }
        
        return maxList.get(0).get(finali);
    }
    
    
    void deepest(List<List<TreeNode>> list, List<TreeNode> nodes, TreeNode node){
        if(node == null){
            return;
        }else{
            List<TreeNode> listl = new LinkedList<>(nodes);
            List<TreeNode> listr = new LinkedList<>(nodes);
            listl.add(node);
            listr.add(node);
            if(node.left == null && node.right == null){
                list.add(listl);
                return;
            }
            if(node.left == null){
                list.add(listl);
                
            }else{
                deepest(list, listl,node.left);
            }
            if(node.right == null){
                list.add(listr);
            }else{
                deepest(list,listr,node.right);
            }
            
        }
        
    }
    
}