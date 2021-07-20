class Solution {
    public int uniquePaths(int m, int n) {
        
      int[][] paths = new int[m+1][n+1];
    
        for(int i = 0; i < m; i++){
            paths[i][0]  = 1;
        }
       for(int j = 0; j <n; j++){
           paths[0][j] = 1;
       } 
        return fact(m -1,n -1,paths);
        
    }
    
    
    
    static int fact(int m, int n, int[][] paths){
        if(m < 0 || n < 0){
            return 0;
        }
      else if(paths[m][n] > 0){
           return paths[m][n] ;
       }
        else {
            int y = fact(m -1, n, paths) + fact(m, n -1, paths);
            paths[m][n] = y;
            return y;
        }
            
    }
}