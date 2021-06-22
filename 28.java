class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.length() == 0 && needle.length() == 0){
            return 0;
        }
        if(needle.length() == 0){
            return 0;
        }
        boolean matcher = false;
        int curPos = 0;
        for(int i = 0; i < haystack.length(); i++ ){
            
            if(haystack.charAt(i) == needle.charAt(curPos)) {
            
                curPos++;
                if(curPos == needle.length()){
                    return i + 1 - curPos;
                }
            }else{
                if(curPos > 0) {
                    
                    i = i - curPos;
                    curPos = 0;
                }
                
            }
            
        }
        return -1;
    }
}