class Solution {
    public String makeGood(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        int i = 0;
        
        while(i < s.length()){

            if(stack.empty()){
                stack.push(s.charAt(i));
                i++;
                continue;
    }
            char top = stack.peek();
            char curr = s.charAt(i);
            if(Character.toLowerCase(top) == Character.toLowerCase(curr)){
                if((Character.isUpperCase(top) &&Character.isLowerCase(curr)) ||
                (Character.isUpperCase(curr) &&Character.isLowerCase(top))){
                    
                    stack.pop();
                    i++;
                    continue;
                }
            }
            
            stack.push(curr);
            i++;
        
        }
        
    StringBuffer b = new StringBuffer();
        while(!stack.empty()){
            
            b.append(stack.pop());
        }
        
    return b.reverse().toString();
    }
}