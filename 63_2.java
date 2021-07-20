class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
       
  int m = obstacleGrid.length;
      int n = obstacleGrid[0].length;
        
         
        int[][] paths = new int[m][n];
        
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n;j++){
                
                if(obstacleGrid[i][j] > 0){
                 paths[i][j] = 0;
                    continue;
                    
            }
                else if(i == 0 && j == 0){
                    paths[i][j] = 1;
                    continue;
                }
                else if(i == 0){
                    paths[i][j] = paths[i][j-1];
                    continue;
                }else if(j == 0){
                    paths[i][j] = paths[i -1][j];
                    continue;
                }
                else{
               paths[i][j] = paths[i -1][j] + paths[i][j-1];
                }
            }
            
        }
        
     
        
        return paths[m - 1][n - 1];
      
    }
    

}