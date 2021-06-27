class Solution {
    public String convert(String s, int numRows) {
        
        
       int col = 0;
        
        int x = s.length();
        System.out.println(x);
        
        if(numRows ==1) return s;
        while(x > 0){
            
            if(x > numRows + (numRows - 2)){
                x -= (numRows + (numRows - 2));
                col += (numRows-2) + 1;
            }else if(x > numRows){
                x -= numRows;
                col += (x + 1);
                x = 0;
            }else {
                x = 0;
                col++;
                }
            }
  
        char[][] mat = new char[numRows][col];
        
  int i = 0; int j = 0; int k = 0;
        boolean inc = true;
        while(k < s.length()){
            
            char t = s.charAt(k);
            System.out.println(i + " " + j);
            mat[i][j] = t;
            if(inc){
                if(i == numRows -1){
                    inc = false;
                    j++;
                    i--;
                    
                }else{i++;}
            }else{
                
                if(i == 0){
                    inc = true;
                    i++;
                }else{
                    i--;
                    j++;
                }
            }
            
            k++;
            
        }
        
        StringBuffer g = new StringBuffer();
    for( i = 0 ; i < numRows; i++){
        
        for( j = 0 ; j < col; j++){
            if(mat[i][j] != '\u0000'){
                g.append(mat[i][j]);
            }
        }
    }
    return g.toString();    
     }
    
}