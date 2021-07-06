class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
         s = s.replace("-", "").toUpperCase();
    
        StringBuffer f = new StringBuffer();
        int count = 0;
        for(int i = s.length()-1; i >=0 ; i--){
            
            f.append(s.charAt(i));
            count++;
            if(count == k && i > 0){
                f.append("-");
                count = 0;
            }
            
            
        }
        
        return f.reverse().toString();
    }
}