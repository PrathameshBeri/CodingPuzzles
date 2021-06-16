class Solution {
    public int reverse(int x) {
        
        StringBuilder b = new StringBuilder();
        int u = Math.abs(x);
        while(u > 0){
            
            int y = u % 10;
            b.append(y);
            u /= 10;
            
        }
        String o = b.toString();
        Integer l;
        try{
         l = Integer.parseInt(b.toString());
        }catch(Exception e){return 0;}
        
        if(x < 0){
            l *= -1;
            
        }
    
            return(l);
    
        
    }
}