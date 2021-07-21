class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int[][] kk = new int[numRows+1][numRows+1];
        
        for(int i = 0; i <=numRows;i++){
            
            for(int j = 0; j<= i;j++){
                kk[i][j] = 1;
            }
        }
        
        for(int i = 1; i <= numRows; i++){
            
            for(int j = 1; j <= i; j++){
                
                kk[i][j] = kk[i -1][j-1] + kk[i-1][j];
            }
        }
        
        List<List<Integer>> finaf = new LinkedList<>();
        
    for(int i = 0 ; i < numRows; i++){
        List<Integer> ii = new LinkedList<>();
        for(int j = 0; j <= i; j++){
            ii.add(kk[i][j]);
        }
        
        finaf.add(ii);
    }
        
        return finaf;
    }
    
}