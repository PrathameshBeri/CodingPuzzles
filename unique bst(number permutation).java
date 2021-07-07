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
    public List<TreeNode> generateTrees(int n) {
        
        List<List<Integer>> returned = generateRandom(n);
        // for(List<Integer> intt : returned){
        //     System.out.println(intt);
        // }
        Set<TreeNode> tree = new HashSet<>();
        for(List<Integer> i : returned){
            
            tree.add(formTree(i));
        }
        List<TreeNode> uu = tree.stream().collect(Collectors.toList());
        return uu;
    }
    
      TreeNode formTree(List<Integer> o){
          
          TreeNode n = new TreeNode(o.get(0));
          for(int i = 1; i < o.size(); i++){
              
              formTreeHelper(n, o.get(i));
          }
          System.out.println(n);
          return n;
      }
    
    void formTreeHelper(TreeNode n, int y){
        
        if(n == null){
            return;
        }else if(n.val <= y){
            if(n.right == null){
                n.right = new TreeNode(y);
            }else{
                formTreeHelper(n.right, y);
            }
        }else{
            if(n.val >= y){
                if(n.left == null){
                    n.left = new TreeNode(y);
                }else{
                    formTreeHelper(n.left, y);
                }
            }
        }
        
    }
        
    
    
    List<List<Integer>> generateRandom(int n){
        if(n ==1){
            List<Integer> s = new LinkedList<>();
            s.add(1);
            List<List<Integer>> ss = new LinkedList<>();
            ss.add(s);
            return ss;
        }else{
            List<List<Integer>> l = generateRandom(n -1);
            List<List<Integer>> cuu = insertCurrent(l, n);
            return cuu;
            
        }
    }
    
  
    
    List<List<Integer>> insertCurrent(List<List<Integer>> o, int n){
        int size = n -1;
        List<List<Integer>> toReturn  = new LinkedList<>();
        
        for(int i = 0 ; i < size; i++){
            List<Integer> jk = o.get(i);
            List<Integer> kkk2 = new LinkedList<>();
            for(int j = 0; j < size; j++){
                kkk2.add(jk.get(j));
                
            } 
        
               kkk2.add(n); 
       
        toReturn.add(kkk2);
        
        }
        for(int i = 0; i < size; i++){
            
        List<Integer> ree = o.get(i);
            for(int j = 0 ; j < size; j++){
                List<Integer> linkd = new LinkedList<>();
                for(int k = 0 ; k < size; k++){
                    if(j == k){
                    linkd.add(j,n);
                    
                     }
                linkd.add(ree.get(k));
                }
              
                toReturn.add(linkd);
                
            }
               
        
    }
    
    
       return toReturn;
    }
}