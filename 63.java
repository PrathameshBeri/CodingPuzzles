class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        
        int[][] paths = new int[obstacleGrid.length + 1][obstacleGrid[0].length+1];
        
   paths[0][0] = 1;
   
        
        
        return findPaths(obstacleGrid.length - 1, obstacleGrid[0].length -1, obstacleGrid, paths);
    }
    
    public int findPaths(int m, int n, int[][] obstacles, int[][] paths){
        
        if(m < 0 || n < 0 || obstacles[m][n] == 1){
            return 0;
        }else if(paths[m][n] > 0){
            return paths[m][n];
        }else{
            int y = findPaths(m,n-1, obstacles, paths) + findPaths(m-1,n,obstacles, paths);
            paths[m][n] = y;
            return y;
        }
        
    }
}