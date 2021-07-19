class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        
        int[][] row = new int[rowIndex + 1][rowIndex + 1];
        
        if(rowIndex == 0){
            List<Integer> oo = new ArrayList<>();
            oo.add(1);
            return oo;
            
        }
        
        
        for(int i = 0; i <= rowIndex; i++){
            for(int j = 0; j <= i; j++){
                row[i][j] = 1;
            
            }
        }
        
         for(int i = 1; i <= rowIndex; i++){
            for(int j = 1; j <= i; j++){
                row[i][j] = row[i-1][j-1] + row[i-1][j];
            }
        }
        
        List<Integer> k = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            k.add(row[rowIndex][i]);
        }
        return k;
    }
}