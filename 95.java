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
        
        List<List<Integer>> returned = permuteThis(n);
        
        
        
        Set<List<Integer>> returnedSet = new HashSet();
        
    
        Set<List<Integer>> treeIteratios = new HashSet<>();
        List<TreeNode> tree = new LinkedList<>();
        for(List<Integer> i : returned){
            
            TreeNode candidate = formTree(i);
            List<Integer> candTree = candidateTree(candidate,n);
            
            if(!treeIteratios.contains(candTree)){
              tree.add(candidate);
               treeIteratios.add(candTree);
            }
        }
       
        return tree;
    }
    
    List<Integer> candidateTree(TreeNode nod, int n){
        
        List<TreeNode> eu = new ArrayList<>();
        
        List<Integer> queu = new ArrayList<>();
        
        int l = 0;
        int k =0;
        eu.add(nod);
        
        
        while(l < n){
            TreeNode oi = eu.get(k);
            if(oi != null){
                eu.add(oi.left);
                eu.add(oi.right);
                queu.add(oi.val);      
                l += 1;
            }else{
                queu.add(null);
            }
            k+=1;
        }
        
           return queu;
    }
    
    void candTreeHelper(TreeNode n, List<Integer> lis){
        
        if(n == null ){
                
                lis.add(null);
                return; 
            
        }else{
            
            lis.add(n.val);
        
             candTreeHelper(n.left,lis);
        
            candTreeHelper(n.right,lis);
            
            
            
        }
        
        
    }
    
    
    
      TreeNode formTree(List<Integer> o){
          
          TreeNode n = new TreeNode(o.get(0));
          for(int i = 1; i < o.size(); i++){
              
              formTreeHelper(n, o.get(i));
          }
       
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
    
    
    
    List<List<Integer>> permuteThis(int n){
        List<Integer> k = new ArrayList<>();
     IntStream.rangeClosed(1,n).forEach(x -> k.add(x));
        Set<List<Integer>> s = permuteHelper(k);
        
        List<List<Integer>> kk = s.stream().collect(Collectors.toList());
        
        return kk;
        
    
    }

    
    public Set<List<Integer>> permuteHelper(List<Integer> avail){
        
        if(avail.size() == 1){
            Set<List<Integer>> s = new HashSet<>();
            s.add(avail);
            return s;
        }else{
     
            Set<List<Integer>> lis = new HashSet<>();
            for(int i = 0; i < avail.size(); i++){
                
                    
                List<Integer> avails = new ArrayList<>();
                for(int j = 0; j < avail.size(); j++){
                    if(j == i){
                        continue;
                    }else{
                        avails.add(avail.get(j));
                    }
                }
                  
                Set<List<Integer>> sol = permuteHelper(avails);
                for(List<Integer> s : sol){
                    
                  s.add(0, avail.get(i));
                    lis.add(s);
                    
                }
                
            }
              return lis;     
        }
    }
    

}