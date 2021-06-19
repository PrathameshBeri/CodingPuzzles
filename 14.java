class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s = strs[0];
        
        String common = strs[0];
        for(int i = 1; i < strs.length; i++){
            common = matchingPat(common, strs[i]);
            
        }
        return common;
    }
    
    
    String matchingPat(String s1, String s2){
        
        String l = s1.length() < s2.length() ? s1:s2;
        
        int n = 0;
        for(int i = 0 ; i < l.length(); i++){
            
            if(s1.charAt(i) == s2.charAt(i)){
                n++;
                continue;
            }else{
                break;
            }
        }
        
        return l.substring(0, n);
    }
}