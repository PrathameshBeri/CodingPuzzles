class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int prev= 0;
        if(s.length() == 0){
            return true;
        }
        if(t.length() == 0 && s.length() == 0){
            return true;
        }
        
        
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(prev) == t.charAt(i)){
                prev++;
                
            }
            if(prev == s.length()){
                return true;
            }
    }
        return false;
        
        
    }
}