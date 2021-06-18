class Solution {
    public int romanToInt(String s) {
        
        int n = 0;
        int prevVal = 0;
        for(int i = 0; i < s.length(); i++){
            
            int val = romanValue(s.charAt(i));
            if(val > prevVal){
                val -= 2 * prevVal;
            }
            
            n += val;
            prevVal = val;
        }
        
        return n;
        
    }
    
    
    
    static int romanValue(char x){
        
        switch(x){
        case 'I': return 1;
        case 'V' : return 5;
        case 'X' : return 10;
        case 'L' : return 50;
        case 'C' : return 100;
        case 'D' : return 500;
        case 'M' : return 1000;
        }
        
        return 0;
    }
}