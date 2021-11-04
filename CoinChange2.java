class Solution {
    public int change(int amount, int[] coins) {
        
        int[] ways = new int[amount + 1];
        
        ways[0] = 1;
        for(int c : coins){
        for(int i = c; i <= amount; i++){
            
                ways[i] += ways[i - c];
            
          }
        }
        return ways[amount];
    }
    
    
}