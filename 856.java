class Solution {
    public int scoreOfParentheses(String s) {
        
      int totalScore = 0;
        int negScore = 0;
        int stackSize = 0;
    Stack<Character> stack = new Stack<>();
        
        int tar = '(' + ')';
        
        for(int i = 0; i < s.length(); i++){
            
            char t = s.charAt(i);
            if(stack.empty()){
                stack.push(t);
                stackSize++;
                continue;
            }
            
            if((stack.peek() + t) == tar){
                
                int curScore = (int)Math.pow(2,stackSize -1);
            
                int curNegScore = 0;
                
                while(i < s.length() && s.charAt(i) == ')'){
                
                   stack.pop();
                   stackSize -= 1;
                i++;
            }
            i--;
        
                totalScore += curScore;
               // negScore += curNegScore;
                
                continue;
            }
            
            stack.push(t);
            stackSize++;
        }
        
        return (totalScore - negScore);
    }
}