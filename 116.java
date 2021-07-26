/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        return reorganize(root);
    }
    
    Node reorganize(Node root){
        List<Node> list = new LinkedList<>();
        int j = 0;
        int i = 0;
        list.add(root);
        while(true){
         int size = list.size();
        
            if(size == j){
                
                break;
            }
            while(i < size ){
                if(size -1 == i){
                    list.get(i).next = null;
                    i++;
                    break;
                }else{
                    list.get(i).next = list.get(i+1);
                    i++;
                }
            }
            for(; j< size; j++){
                Node n = list.get(j);
                if(n.left != null)  list.add(n.left);
                if(n.right != null) list.add(n.right);
            }
        }
        return list.get(0);
    }
}