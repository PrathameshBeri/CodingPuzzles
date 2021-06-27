class Solution {
    public String addStrings(String num1, String num2) {
        
        
        
        int u = num1.length() > num2.length() ? num2.length() : num1.length();
        int l = num1.length() > num2.length() ? num1.length() : num2.length();
        
    String longg = num1.length() > num2.length() ? num1 : num2;
        int carry = 0;
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < u; i++){
            
            int y = (carry + Character.getNumericValue(num1.charAt(num1.length()
                                                         -1 - i))
                    
                    + Character.getNumericValue(num2.charAt(num2.length()- 1 -i)));
            
            if(y >= 10){
                carry = 1;
                s.append(y - 10);
            }
            else{
                carry = 0;
                s.append(y);
            }
            
        }
        
        for(int i = u; i < l; i ++){
            
            int y = carry + Character.getNumericValue(longg.charAt(longg.length() - 1- i));
            
             if(y >= 10){
                carry = 1;
                s.append(y - 10);
            }
            else{
                carry = 0;
                s.append(y);
            }
        }
        if(carry > 0)
            s.append(carry);
        return s.reverse().toString();
    }
                     
                     
}