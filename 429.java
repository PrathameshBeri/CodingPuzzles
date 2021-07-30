/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        return helper(root);
    }
    
    
    List<List<Integer>> helper(Node node){
        List<List<Integer>> results = new LinkedList<>();
        Queue<Node> que = new LinkedList<>();
        if(node == null) return results;
        que.add(node);
        int size = que.size();
        while(size > 0 ){
            
            size = que.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i < size; i++){
                Node n = que.poll();
              
                if(n.children !=null && n.children.size() > 0){
               for(Node child : n.children){
                   que.add(child);
               }
                
                }
                level.add(n.val);
                
            }
            if(level.size() > 0){
            results.add(level);
            }
        }
        return results;
    }
}