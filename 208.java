class Trie {

    static int R = 256;
    
    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        root = insertHelper(word, root, word, 0);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Object n = getter(word, root, 0);
        if(n == null) return false;
        else{
            return true;
        }
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return containsPref(root, prefix, 0, true);
    }
    
    public static class Node{
        Object value;
        Node[] nodes = new Node[R];
        
    }
    
    private Node insertHelper(String key, Node n, String value, int x){
        if(n == null) n = new Node();
        if(x == key.length()){ n.value = key; return n;}
        
        n.nodes[key.charAt(x)] = insertHelper(key, n.nodes[key.charAt(x)], value, x+1);
        return n;
        
    }
    
    private Object getter(String key, Node n, int x){
        if(n == null) return null;
        if(x == key.length()) return n.value;
        else{
            return getter(key, n.nodes[key.charAt(x)],x+1);
        }
    }
    
    private boolean containsPref(Node r, String key, int n, boolean f){
        if(r == null) return false;
        if(n == key.length()) return true;
        if(r.nodes[key.charAt(n)] == null) return false;
        else{
            
            boolean b = f && containsPref(r.nodes[key.charAt(n)], key, n+1, true);
            return b;
        }
        
    }
}




/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */