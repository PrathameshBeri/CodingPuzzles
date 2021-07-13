class Solution {
    public String countAndSay(int n) {
        
        String k = "1";
        
    for(int i = 1; i < n; i++){
        
        k = toNumber(k);
    }
        return k;
        
    }
    
    
    String toNumber(String n){
        
        StringBuffer k = new StringBuffer();
        
        char t = '.';
        int count = 0;
        for(int i = 0; i < n.length(); i++){
                if(n.charAt(i) == t){
                count++;
                continue;
            }else{
                if(count > 0){
                    k.append(count);
                    k.append(t);
                    
                    count = 1;
                    t= n.charAt(i);
                   
                    continue;
                }else{
                    count++;
                    t = n.charAt(i);
                    
                }
                
                
            }
        }
        k.append(count);
        k.append(t);
        return k.toString();
    }
}