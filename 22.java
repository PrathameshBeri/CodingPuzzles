class Solution {
    public List<String> generateParenthesis(int n) {
        
        return generateHelper(n);
    }
    
    
    
    List<String> generateHelper( int n){
        if(n == 1){
            
            List<String> k = new ArrayList<>();
            k.add("()");
            return k;
        }else{
            List<String> generated = generateHelper( n -1);
            Set<String> hashet = new HashSet<>();
            
            for(String s : generated){
                for(int i =0; i < s.length(); i++){
                    StringBuilder x = new StringBuilder(s);
                    x.insert(i,"()");
                    hashet.add(x.toString());
                }
                
            }
            
            return hashet.stream().collect(Collectors.toList());
        }
        
    }
}